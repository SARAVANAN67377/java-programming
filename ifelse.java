import java.util.Scanner;
class hello{
    public static void main(String args[])
    {
        System.out.println("Enter true or false:");
        Scanner hi = new Scanner(System.in);
        boolean a = hi.nextBoolean();
        if(a)
        {
            System.out.print("the statement is true");
        }
        else
        {
            System.out.print("the statement is false");
        }
    }
}