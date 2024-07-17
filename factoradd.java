import java.util.*;
public class factoradd {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long a=sc.nextLong();
    long b;
    for(b=1;b*b<a;b+=1){
        if(a%b==0){
            System.out.printf("(%d*%d)\n",b,a/b);
        }
        
    }
    if(b*b==a)
    System.out.printf("%d",b);
}
}