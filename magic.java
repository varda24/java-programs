import java.util.*;

class magicNumber
{
    public static int magic(int x, int n)
    {
        int digit = 0;
        int i = 1;

        while (x != 0)
        {
            int r = x % 10;

            int d = (r + n) % 10;

            digit = d * i + digit;

            i = i * 10;

            x = x / 10;
        }

        return digit;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        int result = magic(x, n);

        System.out.println(result);
    }
}