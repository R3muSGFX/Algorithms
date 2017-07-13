package algorithms.data_structures;

/**
 * Class containing left and right child of current node and key value
 */
public class BinaryTreeNode
{
    int key;
    public BinaryTreeNode left;
    public BinaryTreeNode right;
    
    public BinaryTreeNode(int item)
    {
        key = item;
        left = right = null;
    }
}
