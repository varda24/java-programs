import java.util.Scanner;

public class find_Q_R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 2 integers: ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int Q=n/m;
        int R=n%m;
        System.out.print("Quotient is "+Q+" remainder is "+R);
    }
}
