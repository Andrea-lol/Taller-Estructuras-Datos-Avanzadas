class Solution {
    public boolean validPath(int n, int[][] edges, int start, int end) {
        boolean[] visited = new boolean[n];
        HashSet<Integer>[] graph = new HashSet[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new HashSet<Integer>();
        }

        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        if (graph[start].contains(end)) {
            return true;
        }

        Queue<Integer> queue = new LinkedList<Integer>();
        int nodoActual;
        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            nodoActual = queue.poll();
            if (nodoActual == end) {
                return true;
            }

            for (int nodoCercano : graph[nodoActual]) {
                if (!visited[nodoCercano]) {
                    visited[nodoCercano] = true;
                    queue.offer(nodoCercano);
                }
            }
        }
        return false;
    }
}
