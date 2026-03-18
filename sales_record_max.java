import java.util.*;
public class sales_record_max {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();   // rows
            int m = sc.nextInt();   // columns

            int[][] a = new int[n][m];
            int[] f = new int[n];

            for (int i = 0; i < n; i++) {
                int max = Integer.MIN_VALUE;

                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();

                    if (a[i][j] > max) {
                        max = a[i][j];
                    }
                }

                f[i] = max;
            }

            // printing result
            for (int i = 0; i < n; i++) {
                System.out.print(f[i] + " ");
            }
        }
}
