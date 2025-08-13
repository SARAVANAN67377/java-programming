class hello{
    public static void main(String args[])
    {
        String a = "swim";
        String b = "swim";

        String c = new String("swim");
        String d = new String("swim");
        System.out.println(a==b);

        System.out.println(c==d);

        System.out.println(c.equals(d));
        
        System.out.println(a==c);

        System.out.print(a.equals(c));
    }
}