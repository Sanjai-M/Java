import java.util.*;
public class Linkedlistinsert{
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
    Linkedlistinsert(){
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
    public void insertbegin(int s){
        Node newnode = new Node(s);
        
        if (head == null){
            head = newnode;
        }
        else{
            newnode.next = head;
            head = newnode; 
        }
        
    }
    public void position(int pos , int k){
        Node newnode = new Node(k);
        
        Node temp = head;
        
        for (int i =1;i<pos;i++){
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public void display(){
        Node temp = head;
        System.out.println("Insert at End");
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print("Null\n");
    }
    public void display1(){
        Node temp = head;
        System.out.println("Insert at Begin");
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print("Null\n");
    }
    public void display2(){
        Node temp = head;
        System.out.println("Insert at Postion");
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next; }
        System.out.print("Null\n");}
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        Linkedlistinsert list = new Linkedlistinsert();
        int m = sc.nextInt();
        for (int i =0 ;i<m;i++){
            int val = sc.nextInt();
            list.insertend(val);}
        list.display();
        int s =sc.nextInt();
        list.insertbegin(s);
        list.display1();
        int pos=2;
        int k=sc.nextInt();
        list.position(pos,k);
        list.display2();}}
