import java.util.*;
class add{
    void add(){
        System.out.println(a+b);
    }
}
class sub extends add{
    void sub(){
        System.out.println(a-b);
    }
}
class mul extends sub{
    void mul(){
        System.out.println(a*b);
    }
}

class div extends mul{
    void div(){
       System.out.println(a/b);
    }
}


class Main1{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        div d=new div();
        d.add();
        d.sub();
        d.mul();
        d.div();
    }
}