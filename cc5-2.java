import java.util.Scanner;

class hello
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int tamil = s.nextInt();
        int eng = s.nextInt();
        int maths = s.nextInt();
        int science = s.nextInt();
        int social_science = s.nextInt();

        int total = tamil+eng+maths+science+social_science;
        int avg = total/5;
        if(avg<35)
        {
            System.out.println("additional class is required");
        }
        else
        {
            System.out.print("good to go");
        }

    }
}