import java.util.Scanner;

class hello{
    public static void main(String args[])
    {
        Scanner i = new Scanner(System.in);
        String hi = i.nextLine();
        if(hi.equals("hello")){
            System.out.print("equal");
        }
        else{
            System.out.print("not equal");
        }
    }
}