package algorithms.main;

import algorithms.data_structures.*;

public class Main
{
    public  static void mainQueue()
    {
        Queue queue = new Queue(1000);
    
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        //queue.enqueue(50);
    
        System.out.print(queue.dequeue() + " dequeued from queue\n");
        System.out.print("Front item is " + queue.front() + "\n");
        System.out.print("Rear item is " + queue.rear() + "\n");
    }
    
    public static void mainQueueLinkedList()
    {
        QueueLinkedList queue = new QueueLinkedList();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        
        System.out.println("Dequeued item is " + queue.dequeue().key);
    }
    
    public static void mainStack()
    {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop() + " popped from the stack");
    }
    
    public static void mainBinaryTree()
    {
        BinaryTree tree  = new BinaryTree();
        
        tree.root = new BinaryTreeNode(1);
        tree.root.left = new BinaryTreeNode(2);
        tree.root.right = new BinaryTreeNode(3);
        tree.root.left.left = new BinaryTreeNode(4);
        tree.root.left.right = new BinaryTreeNode(5);
        
        System.out.println("\nPreorder traversal of binary tree is ");
        tree.printPreorder();
        
        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInorder();
    
        System.out.println("\nPostorder traversal of binary tree is ");
        tree.printPostorder();
        
        System.out.println("\nHeight of tree is: " + tree.Height(tree.root));
    }
    
    public static void main(String[] args)
    {
        //mainQueue();
        //mainQueueLinkedList();
        //mainStack();
        mainBinaryTree();
    }
}