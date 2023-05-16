import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TestFileGenerator {
    public static void main(String[] args) {
        // Datos de entrada
        TreeNode original = createSampleTree();
        TreeNode cloned = createSampleTree();
        TreeNode target = original.left.right;

        // Generar archivo de entrada
        generateInputFile(original, cloned, target);

        // Ejecutar la solución y obtener los resultados
        Solution solution = new Solution();
        TreeNode result = solution.getTargetCopy(original, cloned, target);

        // Generar archivo de salida
        generateOutputFile(result);
    }

    private static TreeNode createSampleTree() {
        TreeNode node1 = new TreeNode(7);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(null);
        TreeNode node5 = new TreeNode(null);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(19);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;

        return node1;
    }

    private static void generateInputFile(TreeNode original, TreeNode cloned, TreeNode target) {
        try {
            FileWriter writer = new FileWriter("in.txt");
            writer.write(treeToString(original) + "\n");
            writer.write(treeToString(cloned) + "\n");
            writer.write(target.val + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generateOutputFile(TreeNode result) {
        try {
            FileWriter writer = new FileWriter("out.txt");
            writer.write(result.val + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String treeToString(TreeNode root) {
        if (root == null) {
            return "null";
        }

        String left = treeToString(root.left);
        String right = treeToString(root.right);

        return root.val + "," + left + "," + right;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}