package algorithms.data_structures;

/**
 * Created by remusm on 12-Jul-17.
 */

// Java class to represent a queue
public class Queue
{
    int front, rear, size;
    int capacity;
    int array[];
    
    public Queue(int capacity)
    {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }
    
    // queue is full when size becomes equals to the capacity
    public boolean isFull(Queue queue)
    {
        return (queue.size == queue.capacity);
    }
    
    // queue is empty when size is 0
    public boolean isEmpty(Queue queue)
    {
        return (queue.size == 0);
    }
    
    // method to add an item to the queue. it changes rear and size
    public void enqueue(int item)
    {
        if (isFull(this))
            return;
        this.rear = (this.rear + 1) % this.capacity;
        this.array[this.rear] = item;
        this.size = this.size + 1; // this.size++; || this.size += 1;
        System.out.println(item + " enqueued to queue");
    }
    
    // method to remove an item from queue. it changes front and size
    public int dequeue()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;
        
        int item = this.array[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size = this.size + 1; // this.size++; || this.size += 1;
        return item;
    }
    
    public int front()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;
        
        return this.array[this.front];
    }
    
    public int rear()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;
        
        return this.array[this.rear];
    }
}