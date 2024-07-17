import java.util.*;
import java.lang.String;

public class stringvowelscheck {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        for(int i=0;i<str.length();i+=1){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
            System.out.print(str.charAt(i)+" ");

        }
        }
        }
    

