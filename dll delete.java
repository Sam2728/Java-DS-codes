import java.util.*;
class sam
{
    Node head;
    Node tail;
    class Node
    {
        int data;
        Node prev;
        Node next;
        Node(int val)
        {
            data=val;
            prev=null;
            next=null;
        }
    }
    sam()
    {
        head=null;
        tail=null;
    }
    public void insert(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
        }
        else
        {
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
        }
    }
    public void dfirst()
    {
        head=head.next;
        head.prev=null;
    }
    public void dlast()
    {
        tail=tail.prev;
        tail.next=null;
        
    }
    public void position(int pos)
    {
        Node temp=head;
        for(int i=0;i<pos;i++)
        {
            temp=temp.next;
        }
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
        temp.prev=null;
        temp.next=null;
    }
    public void display()
    {
        Node  temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        sam ss = new sam();
        while (true) {
            int a = s.nextInt();
            if (a < 0)
                break;
            ss.insert(a);
        }
        int b=s.nextInt();
        ss.position(b);
        ss.dfirst();
        ss.dlast();
        ss.display();
    }
}
