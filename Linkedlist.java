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
    public void deletebegin(){
        head = head.next;
    }
    public void deleteposition(int d){
        Node temp = head;
        Node prev = null;
        
        for(int i=1;i<d;i++){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
    }
    public void deleteAtend(){
        Node temp = head;
        Node prev = null;
        
        while(temp.next!=null){
            prev = temp;
            temp = temp.next;
        } 
        prev.next = null;
    }
    public void display(){
        Node temp = head;
        
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print("Null\n");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        Linkedlist list = new Linkedlist();
        
        int m = sc.nextInt();
        for (int i =0 ;i<m;i++){
            int val = sc.nextInt();
            list.insertend(val);
        }
        
        list.deletebegin();System.out.println("BEGIN");
        list.display();
        list.deleteAtend();System.out.println("END");
        list.display();
        list.deleteposition(3);System.out.println("POS=3");
        
        list.display();}
    }
