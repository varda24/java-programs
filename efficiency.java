import java.util.*;

class efficiency
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int psb1;
        int psb2;

        Arrays.sort(arr);

        psb1 = arr[0] * arr[1] * arr[2];

        psb2 = arr[n-1] * arr[n-2] * arr[n-3];

        int max = Math.max(psb1, psb2);

        System.out.println(max);
    }
}