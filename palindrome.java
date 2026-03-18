import java.util.*;
public class palindrome {

    public static int isPalindrome(char inputStr[], int length)
    {
        int left = 0;
        int right = length - 1;

        while (left <= right)
        {
            if (inputStr[left] == inputStr[right])
            {
                left++;
                right--;
            }
            else
            {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        char[] arr = s.toCharArray();

        int result = isPalindrome(arr, arr.length);
        if(result==1)
        {
            System.out.println("palindrome number");
        }
        else {
            System.out.println("not palindrome number");
        }

    }
}