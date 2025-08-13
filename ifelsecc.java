import java.util.Scanner;

class hello{
    public static void main(String args[])
    {
        System.out.println("predict win or lose");
        Scanner ip = new Scanner(System.in);
        String RCB = ip.nextLine();
        if(RCB.equals("win"))
        {
            System.out.print("Ee Saala cup Namdhe");
        }
        else
        {
            System.out.print("lollipop");
        }
    }
}