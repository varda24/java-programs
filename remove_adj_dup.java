import java.util.*;
public class remove_adj_dup {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();

            Stack<Character> st = new Stack<>();

            for (char ch : s.toCharArray()) {
                if (!st.isEmpty() && st.peek() == ch) {
                    st.pop();  // remove duplicate
                } else {
                    st.push(ch);
                }
            }

            // Build result string
            StringBuilder result = new StringBuilder();
            for (char c : st) {
                result.append(c);
            }

            System.out.println(result.toString());
            sc.close();
        }
    }
