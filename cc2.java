import java.util.Scanner;

class hello{
    public static void main(String args[])
    {
        Scanner hi = new Scanner(System.in);
        int a = hi.nextInt();
        int b = hi.nextInt();
        int c = hi.nextInt();
        int d = a*b*c;
        int e = a+b+c;
        System.out.println(d);
        System.out.println(e);
        System.out.print(d/e);
    }
}