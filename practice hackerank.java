import java.io.*;
import java.util.*;

public class Sam{
    Node head;
    Node tail;
    Stack<int> stack=new Stack<>();
    class Node
    {
        int data;
        Node next;
        Node(int val)
        {
            data=val;
            next=null;
        }
    }
    sam()
    {
        head=null;
        tail=null;
    }
    void op1(int val)
    {
        Node newnode=new Node(val);
        if(head==null)
        {
            stack.push(newnode);
            head=newnode;
            tail=newnode;
        }
        else
        {
            stack.push(newnode);
            tail.next=newnode;
            tail=newnode;
        }
    }
    void op2()
    {
        stack.pop();
    }
    void op3()
    {
        System.out.println(stack.peak());
    }
    void op4()
    {
        if(!stack.isEmpty())
            System.out.println(stack.size());
    }
    void op5()
    {
        if(!stack.isEmpty())
            System.out.println("false");
        else
            System.out.println("true");
            
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        sam ss=new sam();
        int a=s.nextInt();
        for(int i=0;i<a;i++)
        {
            int b=nextInt();
            switch(b)
            {
            case 1:
                x.op1(b);
            break;
            case 2:
                x.op2();
                break;
            case 3:
                x.op3();
                break;
            case 4:
                x.op4();
                break;
            case 5:
                x.op5();
                break;
            }
        }
    /*public void process(int b)
    {
        //Stack<int> stack=new Stack<>();
        //sam x=new sam();
        
        }
    }*/
}
}
