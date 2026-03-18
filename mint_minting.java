import java.util.Scanner;

public class mint_minting {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = sc.nextInt();
        int prev=0;
        int sum=0;
        for (int i=0;i<=len;i++)
        {
            if(i==1)
            {
                sum=n;
            }
            else {
                prev=sum-1;
                sum+=prev;
            }
        }
        System.out.println("Total mints : "+sum);

    }
}
