import java.util.Scanner;
public class Linkedlist{
    Node head;
    
    class Node{
        int data;
        Node next;
        //Node head;
        
        Node(int val){
            data = val;
            next = null;
            //head = null;
        }
    }
    Linkedlist(){
        head = null;
    }
    public void insertend(int val){
        Node newnode = new Node(val);
         
        if (head==null){
            head = newnode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp =  temp.next;       
            }
            temp.next = newnode;
        }
    }
    public void insertbegin(int val){
        Node newnode = new Node(val);
        
        if (head == null){
            head = newnode;
        }
        else{
            newnode.next = head;
            head = newnode; 
        }
        
    }
public void position(int pos , int val){
        Node newnode = new Node(val);
        
        Node temp = head;
        
        for (int i =1;i<pos;i++){
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }
public void display(){
        Node temp = head;
        
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print("Null");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        Linkedlist list = new Linkedlist();
        
        int m = sc.nextInt();
        for (int i =0 ;i<m;i++){
            int val = sc.nextInt();
            list.insertend(val);
        }
        list.display();
        System.out.println();
        System.out.print("The element to add at begining:");
        int a=sc.nextInt();
        list.insertbegin(a);
        list.display();
        System.out.println();
        System.out.print("The element and the pos to add at middle:");
        int b=sc.nextInt();
        int c=sc.nextInt();
        list.position(c,b);
        list.display();
        System.out.println();
        System.out.print("The element to add at end:");
        int z=sc.nextInt();
        list.insertend(z);
        System.out.println();
        list.display();
    }
}
