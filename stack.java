import java.util.*;

class stack
{
    int size = 5;
    int[] arr = new int[size];
    int top = -1;

    void push(int x)
    {
        if (top == size - 1)
        {
            System.out.println("overflow");
        }
        else
        {
            top++;
            arr[top] = x;
        }
    }

    void pop()
    {
        if (top == -1)
        {
            System.out.println("underflow");
        }
        else
        {
            System.out.println(arr[top] + " removed");
            top--;
        }
    }

    void peek()
    {
        if (top == -1)
        {
            System.out.println("stack is empty");
        }
        else
        {
            System.out.println(arr[top]);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        stack s = new stack();

        System.out.println("select operation to perform 1.push 2.pop 3.peek");
        int o = sc.nextInt();

        switch (o)
        {
            case 1:
                System.out.println("enter element to push:");
                int x = sc.nextInt();
                s.push(x);
                break;

            case 2:
                s.pop();
                break;

            case 3:
                s.peek();
                break;

            default:
                System.out.println("invalid choice");
        }
    }
}