import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        // Caso base: si hay solo un nodo, ese es el árbol de altura mínima
        if (n == 1) {
            List<Integer> result = new ArrayList<>();
            result.add(0);
            return result;
        }
        
        // Paso 1: construir el grafo utilizando una lista de adyacencia
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        int[] degrees = new int[n]; // grados de los nodos (número de conexiones)
        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];
            graph.get(a).add(b);
            graph.get(b).add(a);
            degrees[a]++;
            degrees[b]++;
        }
        
        // Paso 2: encontrar las hojas iniciales (nodos con un solo vecino)
        Queue<Integer> leaves = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (degrees[i] == 1) {
                leaves.offer(i);
            }
        }
        
        // Paso 3: eliminar las hojas iterativamente hasta que queden las raíces
        int remainingNodes = n;
        while (remainingNodes > 2) {
            int leavesSize = leaves.size();
            remainingNodes -= leavesSize;
            
            for (int i = 0; i < leavesSize; i++) {
                int leaf = leaves.poll();
                
                for (int neighbor : graph.get(leaf)) {
                    degrees[neighbor]--;
                    if (degrees[neighbor] == 1) {
                        leaves.offer(neighbor);
                    }
                }
            }
        }
        
        // Paso 4: las raíces restantes en el conjunto de hojas son los árboles de altura mínima
        List<Integer> result = new ArrayList<>();
        while (!leaves.isEmpty()) {
            result.add(leaves.poll());
        }
        
        return result;
    }
}
