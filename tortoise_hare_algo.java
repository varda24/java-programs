import java.util.Scanner;
    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public class tortoise_hare_algo
    {
        static boolean hasLoop(Node head)
        {
            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null)
            {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast)
                {
                    return true;   // loop exists
                }
            }

            return false;  // no loop
        }

        public static void main(String[] args)
        {
            // sample linked list with loop
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = head.next;

            if (hasLoop(head))
            {
                System.out.println("Loop detected");
            }
            else
            {
                System.out.println("No loop");
            }
        }
    }

