import java.util.Scanner;

public class interfaces {

    interface a
    {
        public void demo1();
    }
    interface b extends a
    {
        public void demo2();

    }
    static class c implements b
    {
        public void demo1() {System.out.println("demo1");}

        public void demo2() {System.out.println("demo2");}
    }

    public static void main(String[] args)
    {
        c obj=new c();
        obj.demo1();
        obj.demo2();

    }
}
