import java.util.Scanner;

public class string_empty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string : ");
        String s = sc.next();
        if (s.isEmpty()) {
            System.out.print("Empty string");
        }
        else {
            System.out.print("Not empty string");
        }
    }
}
