import java.util.Scanner;
class hello{
    public static void main(String args[])
    {
        String k="hello";
        String j="g";
        do{
            Scanner s = new Scanner(System.in);
            j = s.nextLine();
            System.out.println(j);
        }while(!j.equals(k));
    }
}