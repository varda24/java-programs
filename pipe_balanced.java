import java.util.Scanner;
public class pipe_balanced {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[]a=new int[3];
        int n;
        int m;
        int r;
        int result=0;
        for (int i=0;i<3;i++)
        {
            a[i]=sc.nextInt();
        }
        n=a[0];
        m=a[1];
        r=a[2];
        int[]ac=new int[n];
        int[]rc=new int[m];
        int rc_sum=0;
        int ac_sum=0;
        for (int i=0;i<n;i++)
        {
            ac[i]=sc.nextInt();
            ac_sum=ac_sum+ac[i]-r;
        }
        for (int i=0;i<m;i++)
        {
            rc[i]=sc.nextInt();
            rc_sum=rc_sum+rc[i]-r;
        }
        if(ac_sum==rc_sum)
        {
            System.out.println("BALANCED");
        }
        else
        {
            if(ac_sum>rc_sum)
            {
                result=-1*(rc_sum+r);
            }
            else
            {
                result=(ac_sum+r);
            }
        }

        System.out.println(result);

    }
}
