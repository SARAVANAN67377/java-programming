import java.util.Scanner;

class hello{
    public static void main(String args[]){
        Scanner g = new Scanner(System.in);
        int num1 = g.nextInt();
        if(num1%3==0&&num1%5==0){
            System.out.println("the given no is divisible by 3 and 5");
        }
        else{
            System.out.println("no. is not divisible");
        }
    }
}