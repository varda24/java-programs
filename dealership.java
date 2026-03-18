import java.util.Scanner;

public class dealership {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int c;
        int b;
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
        {
            c= sc.nextInt();
            b= sc.nextInt();
            arr[i]=c*4+b*2 ;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
