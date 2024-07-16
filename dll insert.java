import java.util.*;
class dll{
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int val)
        {
            data=val;
            prev=null;
            next=null;
        }
    }
    dll(){
        head=null;
        tail=null;
    }
    public void insertend(int val)
    {
        Node newnode=new Node(val);
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
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"<--->");
            temp=temp.next;
        }
        System.out.print("Null");
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        dll list=new dll();
        int a=s.nextInt();
        for(int i=0;i<a;i++)
        {
            int val=s.nextInt();
            list.insertend(val);
        }
        list.display();
    }
}
























