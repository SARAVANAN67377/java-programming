import java.util.Scanner;
import java.util.Arrays;

class hello{
    public static void main(String args[])
    {
        int[] b = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(b));
        Scanner d = new Scanner(System.in);
        int[] h = new int[10];
        for(int i=1;i<11;i++)
        {
            int j = i-1;
            h[j] = d.nextInt();
            
        }
        System.out.println(Arrays.toString(h));
        for(int k=0;k<10;k++)
        {
            System.out.println(h[k]);
        }
        
    }
}