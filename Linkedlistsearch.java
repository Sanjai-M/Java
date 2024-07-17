import java.util.*;
public class Linkedlistsearch{
    Node head;
    
    class Node{
        int data;
        Node next;
        Node(int val){
            data = val;
            next = null;
        }
    }
    Linkedlistsearch(){
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
    public void display(){
        Node temp = head;
        
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print("Null");
    }
    public void search(){
        Node temp=head;
        int a=10;
        while(temp!=null){
        if(temp.data==a){
        System.out.print("The element found");
        break;
                }        else
        System.out.println("Not found");
        }
}
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        Linkedlistsearch list = new Linkedlistsearch();
        
        int m = sc.nextInt();
        for (int i =0 ;i<m;i++){
            int val = sc.nextInt();
            list.insertend(val);
        }
        list.search();
        
        //list.display();
    }
}

   
