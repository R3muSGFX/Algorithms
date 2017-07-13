package algorithms.data_structures;

/**
 * Class that implements basic stack operations
 */
public class Stack
{
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX];
    
    public boolean isEmpty()
    {
        return (top < 0);
    }
    
    public Stack()
    {
        top = -1;
    }
    
    public  boolean push(int x)
    {
        if (top >= MAX)
        {
            // stack overflow
            return false;
        }
        else
        {
            a[++top] = x;
            return true;
        }
    }
    
    public int pop()
    {
        if (top < 0)
        {
            // stack underflow
            return 0;
        }
        else
        {
            int x = a[top--];
            return x;
        }
    }
}