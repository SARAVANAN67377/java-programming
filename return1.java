public class return1
{
    int sum(int x,int y)
    {
        return x+y;
    }
    public static void main(String args[])
    {
        return1 obj1 = new return1();
        int k = obj1.sum(20,10);

        return1 obj2 = new return1();
        int j = obj2.sum(30,40); 
        System.out.println(k);
       System.out.println(j);
       
    }
}   