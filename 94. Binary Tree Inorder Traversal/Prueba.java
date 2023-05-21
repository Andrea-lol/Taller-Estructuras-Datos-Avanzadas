import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestGenerator {
    public static void main(String[] args) {
        // Generar datos de entrada
        TreeNode root = generateBinaryTree();

        // Obtener el recorrido inorder usando la solución anterior
        List<Integer> inorderTraversal = inorderTraversal(root);

        // Generar archivos de entrada y salida
        generateInputFile(root);
        generateOutputFile(inorderTraversal);
    }

    // Generar un árbol binario de ejemplo
    private static TreeNode generateBinaryTree() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        return root;
    }

    // Recorrido inorder de un árbol binario
    private static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        // Implementación del recorrido inorder aquí
        // ...
        return res;
    }

    // Generar archivo de entrada
    private static void generateInputFile(TreeNode root) {
        try {
            FileWriter writer = new FileWriter("in.txt");
            // Escribir los datos de entrada en el archivo
            // ...
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Generar archivo de salida
    private static void generateOutputFile(List<Integer> inorderTraversal) {
        try {
            FileWriter writer = new FileWriter("out.txt");
            // Escribir los datos de salida en el archivo
            // ...
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Definición de la clase TreeNode
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
