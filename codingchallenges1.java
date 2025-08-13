/*after getting input as integer from an object the blank spaces are stored in the next character for the same object
 so to avoid this we can create a new object or simply enter a obj.nextLine()(here u.nextLine) below it */
        import java.util.Scanner;

class hello{
    public static void main(String args[])
    {
        Scanner u = new Scanner(System.in);
        Scanner v = new Scanner(System.in);
        String i = u.nextLine();
        int j = u.nextInt();
        String k = v.nextLine();
        int l = u.nextInt();
        u.nextLine();
        String n = u.nextLine();
        System.out.println("My name is" +i);
        System.out.println("my age is" +j);
        System.out.println("my address is"+k);
        System.out.println("my ph no. is "+l);
        System.out.print("my email is "+n);
    }
}