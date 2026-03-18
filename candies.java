import java.util.*;
public class candies {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int N = 10;
        int k = 5;

        if (x <= k && x >= 0)
        {
            System.out.println("candies sold: " + x);

            N = N - x;

            System.out.println("no of candies remaining: " + N);
            N=N+x;
        }
        else
        {
            System.out.println("Invalid Input");
            System.out.println("no of candies remaining: " + N);
        }
    }
}