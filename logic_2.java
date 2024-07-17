import java.util.*;
public class logic_2
{
       
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int[]arr= new int[a];
        int i,t=0,s=0;
        for(i=0;i<a;i++){
            arr[i]= sc.nextInt();
            s+=arr[i];
        }
         t=s;
         
        for(i=0;i<a;i++)
        {
            arr[i]=t-arr[i];
            System.out.print(arr[i]+" ");
            t=arr[i];
        }
        


    
    }
}


