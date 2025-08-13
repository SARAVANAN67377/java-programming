import java.util.Scanner;
public class hello{
    public static int[] movingzero(int[] arr)
    {
       int left=0;
       int right=0;
       for(right=0;right<arr.length;right++)
       {
           if(arr[right]!=0)
           {
               int temp=arr[left];
               arr[left]=arr[right];
               arr[right]=temp;
               left++;
           }
       }
       int[] q = new int[arr.length];
       for(int k=0;k<arr.length;k++)
       {
           q[k] = arr[k];
       }
       return q;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        hello obj= new hello();
        int[] t = obj.movingzero(arr);
        for(int h=0;h<t.length;h++)
        {
            System.out.print(t[h]+" ");
        }
        
    }
}