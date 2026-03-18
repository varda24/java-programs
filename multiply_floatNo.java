import java.util.Scanner;

public class multiply_floatNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter two floating point no.: ");
        float a= sc.nextFloat();
        float b= sc.nextFloat();
        System.out.println("Multiplication is "+(a*b));
    }
}
