import java.util.Scanner;
import java.util.HashMap;
public class hello
{
    public static HashMap<Integer,Integer> method(int[] arr)
    {
     HashMap<Integer,Integer>map = new HashMap<>();
     
     for(int j=0;j<arr.length;j++)
     {
         int num = arr[j];
         
         if(map.containsKey(num))
         {
             map.put(num,map.get(num)+1);
         }
         else
         {
             map.put(num,1);
         }
     }
      return map;  
    }
 public static void main(String args[])
 {
     Scanner sc = new Scanner(System.in);
     int size = sc.nextInt();
     int[] arr = new int[size];
     for(int i=0;i<size;i++)
     {
         arr[i] = sc.nextInt();
     }
     hello obj = new hello();
     HashMap <Integer,Integer> map = obj.method(arr);
     
     for(int key:map.keySet())
     {
         System.out.print("key:"+key+"frequency:"+map.get(key));
         System.out.println();
     }
 }
    
}
