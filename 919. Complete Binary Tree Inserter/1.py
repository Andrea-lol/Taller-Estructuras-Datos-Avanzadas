from collections import deque

class CBTInserter:
    def __init__(self, root):
        """
        :type root: TreeNode
        """
        self.root = root
        self.queue = deque()
        self.populate_queue(root)

    def insert(self, val):
        """
        :type val: int
        :rtype: int
        """
        parent = self.queue[0]
        node = TreeNode(val)
        if not parent.left:
            parent.left = node
        else:
            parent.right = node
            self.queue.popleft()
        self.queue.append(node)
        return parent.val

    def get_root(self):
        """
        :rtype: TreeNode
        """
        return self.root

    def populate_queue(self, root):
        if not root:
            return
        queue = deque([root])
        while queue:
            node = queue.popleft()
            if not node.left or not node.right:
                self.queue.append(node)
            if node.left:
                queue.append(node.left)
            if node.right:
                queue.append(node.right)