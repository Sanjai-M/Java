import java.util.*;

public class logic_arr {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int[]arr= new int[a];
        int i,s=0;
        for(i=0;i<a;i++){
            arr[i]=sc.nextInt();
            s+=arr[i];
        }
        for(i=0;i<a;i++)
        {
            System.out.print(s-arr[i]+ " ");
        }


    
    }
}
