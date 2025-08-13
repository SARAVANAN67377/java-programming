class hello
{
    public static void main(String args[])
    {
        int g = 0;
        for(int i=0;i<1000;i++)
        {
            if(i==0)
            {
                System.out.println(i+" is neither even nor odd");
            }
            else if(i%2==0)
            {
                System.out.println("even"+i);
                g++;
             }
            
        } System.out.println("no.of even"+g);
    
    } 
}