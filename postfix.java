import java.util.*;

class postfix
{
    int[] stack;
    int top;
    int size;

    postfix(int size)
    {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    void push(int x)
    {
        if (top == size - 1)
        {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = x;
    }

    int pop()
    {
        if (top == -1)
        {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter postfix expression: ");
        String exp = sc.next();

        int size = exp.length();

        postfix st = new postfix(size);

        for (int i = 0; i < size; i++)
        {
            char ch = exp.charAt(i);

            if (Character.isDigit(ch))
            {
                st.push(ch - '0');
            }
            else
            {
                int b = st.pop();
                int a = st.pop();

                switch (ch)
                {
                    case '+':
                        st.push(a + b);
                        break;

                    case '-':
                        st.push(a - b);
                        break;

                    case '*':
                        st.push(a * b);
                        break;

                    case '/':
                        if (b == 0)
                        {
                            System.out.println("Division by zero error");
                            return;
                        }
                        st.push(a / b);
                        break;

                    default:
                        System.out.println("Invalid operator");
                        return;
                }
            }
        }

        System.out.println("Result = " + st.pop());
    }
}