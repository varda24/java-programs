import java.util.Scanner;

public class emp_prob_solve {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        int p3= sc.nextInt();
        int q= sc.nextInt();
        int e = sc.nextInt();
        int r = sc.nextInt();
        int m=e-r;

        int b=m-p1-p2-p3+2*q;
        int a=b-(m-(2*p1+2*p3+p2)+2*q)/3;
        System.out.println("only first problem is solved by "+a+" employes");
        System.out.println("only one problem is solved by "+b+" employes");
    }
}
