class Solution {
    public boolean validPath(int n, int[][] edges, int start, int end) {
        ArrayList<ArrayList<Integer>> vertices = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            vertices.add(new ArrayList<>());
        }
        for(int i = 0; i < edges.length; i++) {
            int x = edges[i][0];
            int y = edges[i][1];
            vertices.get(x).add(y);
            vertices.get(y).add(x);
        }
        
        int[] vertVisitados = new int[n];
        Arrays.fill(vertVisitados, -1);
        Queue<Integer> que = new LinkedList<>();
        que.add(start);
        vertVisitados[start] = 0;
        while(!que.isEmpty()) {
            int r = que.remove();
            if(r == end)
                return true;
            for(int i = 0; i < vertices.get(r).size(); i++) {
                int nodoCercano = vertices.get(r).get(i);
                if(vertVisitados[nodoCercano] == -1) {
                    vertVisitados[nodoCercano] = vertVisitados[r] + 1;
                    que.add(nodoCercano);
                }
            }
        }
        return false;
    }
}
