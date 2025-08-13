import java.util.Scanner;

class hello{
public static void main(String args[])
{
    Scanner hi = new Scanner(System.in);
    int mark = hi.nextInt();
    if(mark>35){
        System.out.println("pass");
    }
    else{
        System.out.print("fail");
    }
}
}