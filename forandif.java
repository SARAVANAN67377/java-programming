class hello
{
    public static void main(String args[])
    {
        int oddcount=0;
        for(int i=1;i<=10;i++)
        {
            if(i%2==0)
            {
                //System.out.println("no. is even"+i);
            }
            else
            {
                oddcount=oddcount+1;
                System.out.println("no. is odd"+i);
                System.out.println(oddcount);
            }
        }
    }
}