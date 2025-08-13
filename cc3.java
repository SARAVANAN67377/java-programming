import java.util.Scanner;

class hello{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int score = s.nextInt();
        s.nextLine();
        String dept = s.nextLine();
        System.out.println("my name is"  +name);
        System.out.println("department is"  +dept);
        System.out.println(score/10+"/10");
    }
}