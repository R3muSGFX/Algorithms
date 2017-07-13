package algorithms.data_structures;

/**
 * A class to represent a queue
 * The queue, front stores the front node of linked list and rear stores the last node of the linked list
 */
public class QueueLinkedList
{
    QNode front, rear;
    
    /**
     * Constructor for Queue Linked List
     */
    public QueueLinkedList()
    {
        this.front = this.rear = null;
    }
    
    /**
     * Method to add a key to the queue
     * @param key
     */
    public  void enqueue(int key)
    {
        // create new linked list node
        QNode temp = new QNode(key);
        
        // if queue is empty, then new node is front rear both
        if (this.rear == null)
        {
            this.front = this.rear = temp;
            return;
        }
        
        // add the new node at the end of the queue and change rear
        this.rear.next = temp;
        this.rear = temp;
    }
    
    /**
        Method to remove a key from queue
     */
    public QNode dequeue()
    {
        // if queue is empty, return NULL
        if (this.front == null)
        {
            return null;
        }
        
        QNode temp = this.front;
        this.front = this.front.next;
        
        // if front becomes null, then change rear also as null
        if (this.front == null)
        {
            this.rear = null;
        }
        
        return temp;
    }
    
    
}
