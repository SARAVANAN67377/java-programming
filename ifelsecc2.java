import java.util.Scanner;

class hello{
    public static void main(String args[])
    {
        Scanner ip = new Scanner(System.in);
        String meghana = ip.nextLine();
        if(meghana.equals("dead"))
        {
            System.out.println("Surya meets ramya");
        }
        else
        {
            System.out.print("Surya weds meghana");
        }
    }
}