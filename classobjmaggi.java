public class classobjmaggi{
    String water = "";
    int maggi = 0;
    String veggies = "";

    public static void main(String args[])
    {
        classobjmaggi server1 = new classobjmaggi();
        classobjmaggi server2 = new classobjmaggi();

        server1.maggi=3;
        server1.veggies="potato";
        server1.water="1000ml";

        server2.water="800ml";
        server2.maggi=2;

        System.out.println(server1.maggi);
        System.out.println(server2.maggi);
        System.out.println(server1.veggies);
        System.out.println(server1.water);
        System.out.println(server2.water);
    }
}