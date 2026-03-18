import java.util.*;

class travel
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int r1 = sc.nextInt();
        int n  = sc.nextInt();
        int r2 = sc.nextInt();
        int x  = sc.nextInt();

        int m;

        if (x % 60 == 0)
        {
            m = x / 60;
        }
        else
        {
            m = x / 60 + 1;
        }

        int result = r1 * n + r2 * (m - n);

        System.out.println(result);
    }
}