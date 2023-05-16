import java.io.FileWriter;
import java.io.IOException;

public class TestFileGenerator {
    public static void main(String[] args) {
        // Datos de entrada
        int n = 4;
        int[][] edges = {{1, 0}, {1, 2}, {1, 3}};

        // Generar archivo de entrada
        generateInputFile(n, edges);

        // Ejecutar la solución y obtener los resultados
        Solution solution = new Solution();
        List<Integer> minHeightTrees = solution.findMinHeightTrees(n, edges);

        // Generar archivo de salida
        generateOutputFile(minHeightTrees);
    }

    private static void generateInputFile(int n, int[][] edges) {
        try {
            FileWriter writer = new FileWriter("in.txt");
            writer.write(n + "\n");
            for (int[] edge : edges) {
                writer.write(edge[0] + " " + edge[1] + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generateOutputFile(List<Integer> minHeightTrees) {
        try {
            FileWriter writer = new FileWriter("out.txt");
            for (Integer root : minHeightTrees) {
                writer.write(root + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}