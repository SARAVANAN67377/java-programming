import java.util.Scanner;

class hello
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int salary = s.nextInt();
        int age = s.nextInt();

        if(salary>=20000||age<=25)
        {
            int loan_amt = s.nextInt();
            if(loan_amt<=50000)
            {
                System.out.println("you are eligible for loan");
            }
            if(loan_amt>50000)
            {
                System.out.println("max loan amt is 50000");
            }
        }
        else
        {
            System.out.print("you are not eligible for loan");
        }
    }
}