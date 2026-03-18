import java.util.Scanner;


public class string_to_number {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int sum=0;
        if(str.equals("NULL")){
            System.out.print("NULL");
        }
        else {

            for(int i=0;i<str.length()-1;i++)
            {
                char ch=str.charAt(i);
                switch(ch)
                {
                    case 'A':
                        sum=sum+1;
                        break;
                    case 'B':
                        sum=sum+10;
                        break;
                    case 'C':
                        sum=sum+100;
                        break;
                    case 'D':
                        sum=sum+1000;
                        break;
                    case 'E':
                        sum=sum+10000;
                        break;
                    case 'F':
                        sum=sum+100000;
                        break;
                    case 'G':
                        sum=sum+1000000;
                        break;
                }
            }
            System.out.print(+sum);
        }
    }
}
