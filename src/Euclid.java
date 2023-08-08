import java.util.Scanner;

public class Euclid
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        while(true)
        {
            System.out.println("enter two positive integers with a space in between to get the GCD: ");
            String input = scan.nextLine();
            if("".equals(input))
            {
                break;
            }
            String [] number = input.split(" ");
            if(number.length == 2)
            {
                try
                {
                    int m = Integer.parseInt(number[0]);
                    int n = Integer.parseInt(number[1]);
                    System.out.println(GCD(m, n));
                } catch(NumberFormatException nfe)
                {
                    System.out.println("wrong input type " + nfe.getMessage());
                }
            }
            else
            {
                System.out.println("invalid input");
            }
        }
        System.out.println("Bye-bye");
    }

    public static int GCD(int m, int n)
    {
        if(m < n)
        {
            int temp = m;
            m = n;
            n = temp;
        }
        if(m % n == 0)
        {
            return n;
        } else
        {
            return GCD(n, m % n);
        }
    }

}
