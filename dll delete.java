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
    public void dfirst()
    {
        Node temp=head;
        Node temp2=temp.next;
        temp.next.prev=null;
        temp.next=null;
        head=temp2;
    }
    public void dlast()
    {
        Node temp=tail;
        Node temp2=tail.prev;
        temp.prev.next=null;
        temp.prev=null;
        tail=temp2;
    }
    public void dmid(int pos)
    {
        Node temp=head;
        Node back=null;
        Node front=temp.next;
        for(int i=1;i<=pos;i++)
        {
        temp=temp.next;
        back=temp.prev;
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
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
        list.dfirst();
        list.dlast();
        //int pos=s.nextInt();
        //list.dmid(pos);
        list.display();

    }
}



































