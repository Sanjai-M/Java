import java.util.*;
import java.lang.String;
class vj{
    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        String[] arr={"even","odd"};
        System.out.println(arr[n%2]);
        int num=534;
        int sum=num%9==0?9:num%9;
        System.out.println(sum);


    }
}