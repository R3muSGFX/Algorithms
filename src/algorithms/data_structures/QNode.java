package algorithms.data_structures;

/**
    A Linked List node to store a queue entry
 */
public class QNode
{
    public int key;
    QNode next;
    
    public QNode(int key)
    {
        this.key = key;
        this.next = null;
    }
}
