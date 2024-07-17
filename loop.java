import java.util.*;
class loop {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);

        //print even numbers from start till end
       long a=s.nextLong();
        long b=s.nextLong();
        long c=a;
        while(c<=b){
            if(c%2==0)
            System.out.printf("%d ",c);
            c++;
        }

        //sum of even numbers in range
         long sum=0;
        for(c=a;c<=b;c+=1){
            if(c%2==0)
            sum=sum+c;
        }System.out.print(sum);

        //print sum of number tha are divisible by either 3 or 5
        long num1=s.nextLong();
        for(long i=1;i<=num1;i++){
            if(i%3==0 || i%5==0){
                sum+=i;
            }
        }System.out.print(sum);
        
        
        
    }
    
    
}
