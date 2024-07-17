import java.util.*;
public class array_r {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int[]arr= new int[a];
        int i;
        for(i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        
        //right rotation
        int t;
        t=arr[a-1];
        for(i=a-1;i>=1;i-=1){
            arr[i] = arr[i-1];
        }
        arr[0]=t;
    for(i=0;i<a;i+=1)
        System.out.print(arr[i]+" ");
    }
}
