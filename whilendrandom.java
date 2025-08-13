import java.util.Random;
class hello{
    public static void main(String args[])
    {
        int i=10;

        while(i<11)
        {
            System.out.println(i);
            i++;
        }
        Random s = new Random();
        int j = s.nextInt(100);

        while(j<50)
        {
            System.out.println(j);
            j++;

        }

    }
}