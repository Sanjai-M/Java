import java.util.*;
public class arrayL {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int[]arr= new int[a];
        int i;
        for(i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }

        //left rotation
        int t;
        t=arr[0];
        for(i=0;i<=a-2;i+=1){
            arr[i] = arr[i+1];
        }
        arr[a-1]=t;
    for(i=0;i<a;i+=1)
        System.out.print(arr[i]+" ");
    }

    
}
