import java.io.FileWriter;
import java.io.IOException;

public class TestFileGenerator {
    public static void main(String[] args) {
        // Crear el árbol de ejemplo
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        
        // Crear el objeto CBTInserter con el árbol de ejemplo
        CBTInserter cBTInserter = new CBTInserter(node1);
        
        // Insertar un nuevo nodo y obtener el valor del padre
        int parentValue = cBTInserter.insert(5);
        
        // Obtener el nodo raíz del árbol
        TreeNode root = cBTInserter.get_root();
        
        // Generar el archivo de entrada
        generateInputFile(root, parentValue);
        
        // Generar el archivo de salida
        generateOutputFile(root);
    }

    private static void generateInputFile(TreeNode root, int parentValue) {
        try {
            FileWriter writer = new FileWriter("in.txt");
            writeTreeNode(writer, root);
            writer.write(parentValue + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generateOutputFile(TreeNode root) {
        try {
            FileWriter writer = new FileWriter("out.txt");
            writeTreeNode(writer, root);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static void writeTreeNode(FileWriter writer, TreeNode node) throws IOException {
        if (node == null) {
            writer.write("null\n");
            return;
        }
        
        writer.write(node.val + "\n");
        writeTreeNode(writer, node.left);
        writeTreeNode(writer, node.right);
    }
}