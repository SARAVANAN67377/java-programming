import java.util.Scanner;
public class cc4fun
{
    void evenorodd(int num)
    {
        if(num%2==0)
        {
            System.out.println("it is even" );
        }
        else
        {
            System.out.println("it is odd");
        }
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        System.out.println(k);

        cc4fun obj = new cc4fun();
        obj.evenorodd(k);

    }
}