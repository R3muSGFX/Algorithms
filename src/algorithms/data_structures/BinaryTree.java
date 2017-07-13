package algorithms.data_structures;

public class BinaryTree
{
    public BinaryTreeNode root;
    
    public BinaryTree(int key)
    {
        root = new BinaryTreeNode(key);
    }
    
    public BinaryTree()
    {
        root = null;
    }
    
    /**
     * Given a binary tree, print its nodes according to the bottom-up postorder traversal
     * @param node
     */
    void printPostorder(BinaryTreeNode node)
    {
        if (node == null)
        {
            return;
        }
        
        // first recursive on left subtree
        printPostorder(node.left);
        
        // first recursive on right subtree
        printPostorder(node.right);
        
        System.out.print(node.key + " ");
    }
    
    /**
     * Given a binary tree, print its nodes in inorder
     * @param node
     */
    void printInorder(BinaryTreeNode node)
    {
        if (node == null)
        {
            return;
        }
        
        // first recursive on left child
        printInorder(node.left);
        
        // print the data of the node
        System.out.print(node.key + " ");
        
        // now recursive on right child
        printInorder(node.right);
    }
    
    /**
     * given a binary tree, print its nodes in preorder
     * @param node
     */
    void printPreorder(BinaryTreeNode node)
    {
        if (node == null)
        {
            return;
        }
        
        // first print the data of the node
        System.out.print(node.key + " ");
        
        // then recursive on left subtree
        printPreorder(node.left);
        
        // now recursive on left subtree
        printPreorder(node.right);
    }
    
    public void printPostorder()
    {
        printPostorder(root);
    }
    
    public void printInorder()
    {
        printInorder(root);
    }
    
    public void printPreorder()
    {
        printPreorder(root);
    }
    
    public int Height(BinaryTreeNode node)
    {
        if (node == null)
        {
            return 0;
        }
        else
        {
            int leftDepth = Height(node.left);
            int rightDepth = Height(node.right);
            
            // Return the larger depth
            if (leftDepth > rightDepth)
            {
                return leftDepth + 1;
            }
            else
            {
                return rightDepth + 1;
            }
        }
    }
}
