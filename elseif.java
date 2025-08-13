import java.util.Scanner;

class hello
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int marks = s.nextInt();
        if(marks>35&&marks<=60)
        {
            System.out.println("i will buy u a video game");
        }
        else if(marks>60&&marks<=90)
        {
            System.out.println("i will buy u an iphone");

        }
        else if(marks>60&&marks<=90)
        {
            System.out.println("i will buy u a macbook pro");
        }
        else
        {
            System.out.println("wasted");
        }
        System.out.println("hello");
    }
}