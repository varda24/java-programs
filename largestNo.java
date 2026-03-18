import java.util.Scanner;

public class largestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 3 numbers: ");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.print(a+" is largest no");
        }
        else if(b>a && b>c)
        {
            System.out.print(b+" is largest no");
        }
        else {
            System.out.print(c+" is largest no");
        }
    }
}
