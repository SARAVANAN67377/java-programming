import java.util.Scanner;
class hello{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int j = s.nextInt();
        int k = s.nextInt();
        String m = j>k?"j is greater":"k is greater";
        System.out.print(m);
    }
}