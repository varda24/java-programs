import java.util.Scanner;

public class strong {
    public static int fact(int i)
    {
        if(i==1|| i==0)
        {
            return 1;
        }
        else {
            return (i*fact(i-1));
        }
    }
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int result=0;
        int original=n;
        while (n!=0)
        {
            int r=n%10;
            n=n/10;
            result+=fact(r);
        }
        if (result == original){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
