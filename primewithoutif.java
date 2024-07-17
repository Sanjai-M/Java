import java.util.*;
import java.lang.Math;
class primewithoutif{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean[] bool=new boolean[n];
        for(int i=0;i<bool.length;i++){
            bool[i]=true;
        }
        for(int i=2;i<Math.sqrt(n);i+=1){
            if(bool[i]==true){
                for(int j=i*i;j<n;j+=i){
                    bool[j]=false;
                }

            }
        }
        for(int i=2;i<bool.length;i++){
            if(bool[i]==true){
                System.out.print(i+" ");
            }
        }
    }
}