import java.util.*;
public class test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int i,j,dup=0,count=0;
        int arr[]=new int[size];
        for(i=0;i<size;i++)
            arr[i]=sc.nextInt();
            try{for(i=0;i<size;i++){
                for(j=0;j<size;j++){
                    if(arr[i]==arr[j]&&j!=i){
                        dup=arr[i];
                        count++;
                    }}}int a=count/0;}
        catch(ArithmeticException e){
        if(count>0)
        System.out.printf("Duplicate number found :%d",dup);
        else
        System.out.println("No duplicate number");
    }}}