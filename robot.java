import java.util.Scanner;
public class robot {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();

        int j;
        int[][]a=new int[m][n];
        int i;
        for(i=0; i<m; i++)
        {
            a[i][0]=1;
        }
        for(j=0;j<n;j++) {
            a[0][j] = 1;
        }
        for(i=1;i<m;i++)
        {
            for(j=1;j<n;j++)
            {
                a[i][j]=a[i][j-1]+a[i-1][j];
            }
        }
        System.out.println(a[m-1][n-1]);
    }
}
