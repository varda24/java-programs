import java.util.Scanner;

class wall_painting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of walls and ceiling sections
        int ni = sc.nextInt();  // number of wall areas
        int ne = sc.nextInt();  // number of ceiling areas

        float sum = 0;

        // Input wall areas and calculate cost (rate = 18 per unit)
        for (int i = 0; i < ni; i++) {
            float SAi = sc.nextFloat();
            sum = sum + (18 * SAi);
        }

        // Input ceiling areas and calculate cost (rate = 12 per unit)
        for (int i = 0; i < ne; i++) {
            float SAe = sc.nextFloat();
            sum = sum + (12 * SAe);
        }

        // Output result
        System.out.printf("Total estimated cost: %.1f INR", sum);

        sc.close();
    }
}