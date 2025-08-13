public class function{
    static void greetings()
    {
        System.out.println("vanakkam");
        function obj=new function();
        obj.eating();
        gifting();
    }
    static void gifting()
    {
        System.out.println("gift");
    }
    void eating()
    {
        System.out.println("rice");
    }
    public static void main(String args[])
    {
        greetings();
        
    }

}