class xor
{
    public static void main(String args[])
    {
        int a=23;
        int b=54;
         a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);
    }
}