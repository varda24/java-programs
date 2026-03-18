import java.util.Scanner;

import java.util.Scanner;
public class alpha_vowel {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("enter character : ");
            char a = sc.next().charAt(0);
            String s="aeiou";
            if(s.contains(String.valueOf(a))){
                System.out.print("vowel");
            }
            else {
                System.out.print("Alphabet");
            }
        }
}
