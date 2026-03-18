import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter two integers: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int t=a;
        a=b;
        b=t;
        System.out.println("swapped no. "+a+" "+b);
    }
}
