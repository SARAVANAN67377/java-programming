public class functionpara
{
    static void chocolate(int x)
    {
        if(x>=10)
        {
            System.out.println("chocolate purchased");
        }
        else
        {
            System.out.println("need more money");
        }
         
    }
    static void powder(double y)
    {
        System.out.println("powder is purchased");
    }

    public static void main(String args[])
    {
        chocolate(5);
        powder(10);
    }
}