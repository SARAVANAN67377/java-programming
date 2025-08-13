import java.util.Scanner;
import java.util.Arrays;
class hello{
    public static void main(String args[])
    {
        Scanner d = new Scanner(System.in); 
        int[] f = new int[5];
        f[0] = d.nextInt();
        f[1] = d.nextInt();
        f[2] = d.nextInt();
        f[3] = d.nextInt();
        f[4] = d.nextInt();

        System.out.println(Arrays.toString(f));

        for(int i=0;i<5;i++)
        {
            int j=i;
            f[j] = d.nextInt();
        }
            System.out.println(Arrays.toString(f));
    }
}