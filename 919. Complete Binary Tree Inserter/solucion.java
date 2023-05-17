import java.util.LinkedList;
import java.util.Queue;

class CBTInserter {
    private TreeNode root;
    private Queue<TreeNode> queue;

    public CBTInserter(TreeNode root) {
        this.root = root;
        this.queue = new LinkedList<>();
        
        // Perform a level order traversal to populate the queue
        // with nodes of the complete binary tree
        Queue<TreeNode> temp = new LinkedList<>();
        temp.offer(root);
        
        while (!temp.isEmpty()) {
            TreeNode node = temp.poll();
            queue.offer(node);
            
            if (node.left != null)
                temp.offer(node.left);
            
            if (node.right != null)
                temp.offer(node.right);
        }
    }
    
    public int insert(int val) {
        TreeNode newNode = new TreeNode(val);
        queue.offer(newNode);
        
        TreeNode parent = queue.peek();
        
        if (parent.left == null)
            parent.left = newNode;
        else {
            parent.right = newNode;
            queue.poll();
        }
        
        return parent.val;
    }
    
    public TreeNode get_root() {
        return root;
    }
}