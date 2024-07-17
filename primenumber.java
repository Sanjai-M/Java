import java.util.*;
public class primenumber{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long a=sc.nextLong();
    long i;
    for(i=2;i*i<=a;i+=1){
        if(a%i==0)
        break;
    
    }
    if(i*i>a)
    System.out.println("prime number");
    else
    System.out.println("not prime");
    }
    }
