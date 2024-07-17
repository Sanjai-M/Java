import java.net.SocketPermission;
import java.util.*;
public class Linkedlistall{
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
    Linkedlistall(){
        head = null;
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


    public void insertall(int s){
        Node newnode = new Node(s);
        
        if (head == null){
            head = newnode;
        }
        else{
            newnode.next = head;
            head = newnode; 
        }
        
    }


    public void max(){    
        int max=head.data;
        Node temp=head;
        while (temp != null){
            if (max<temp.data) {
            max=temp.data;}
            temp=temp.next;
}
    System.out.println("MAX IN LIST:"+max);
}


public void min(){    
    int min=head.data;
    Node temp=head;
    while (temp != null){
        if (min>temp.data) {
        min=temp.data;}
        temp=temp.next;
}
System.out.println("Min IN LIST:"+min);
}


public void search(){
    Node temp=head;
    int a=10;
    while(temp!=null){
    if(temp.data==a){
    System.out.println("The element found");
    break;
            }else{
    System.out.println("Not found");
    break;}}
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

public void insertAtPosition(int val, int pos) {
    Node newnode = new Node(val);

    if (pos == 1) {
        newnode.next = head;
        head = newnode;
    } else {
        Node temp = head;
        int count = 1;
        while (temp != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }

        newnode.next = temp.next;
        temp.next = newnode;
    }
}
public void reverse(){
    Node prev = null;
    Node current = head;
    //Node next = current.next;
    while (current != null){
        Node next = current.next ;
        current.next = prev;
        prev = current;
        current = next;
    }
    head = prev;
}
public void sort(){ 
    if(head==null||head.next==null)
    return;
    else{
       Node current,index;
       int temp;
       for(current=head;current.next!=null;current=current.next){
           for(index=current.next;index!=null;index=index.next){
               if(current.data>index.data){
                   temp=current.data;
                   current.data=index.data;
                   index.data=temp;
               }
           }
       }
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
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        Linkedlistall list = new Linkedlistall();
        System.out.println("size");
        int m = sc.nextInt();
        for (int i =0 ;i<m;i++){
            int val = sc.nextInt();
            list.insertend(val);
        }
        int s =sc.nextInt();

        
        list.insertAtPosition(m,s);
        int
        list.insertbegin(s);
        list.deletebegin();
        
        list.deleteposition(s);
        list.max();
        list.min();
        list.sort();
        list.search();
        list.reverse();
        
        list.display();


}
}