import java.util.Scanner;

class hello{
    public static void main(String args[]){
        Scanner u = new Scanner(System.in);
        int income = u.nextInt();
        if(income>7000){
            System.out.println("Schlorship");
        }
        else{
            System.out.print("not eligible");
        }
    }
}