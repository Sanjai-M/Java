import java.util.*;
public class linear {
public static void main(String[] args)
{
        int i,sum=0;
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        int key=obj.nextInt();
        int[] arr=new int[size];
        for(i=0;i<size;i+=1)
        {
            arr[i]=obj.nextInt();
        }

        for(i=0;i<=size;i+=1)
        {
            if(arr[i]==key);
            break;
        }
        if(i<size)
        System.out.println("FOUND");
        else
        System.out.println("NOT FOUND");

}
}
