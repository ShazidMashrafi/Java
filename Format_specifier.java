public class Format_specifier
{
    public static void main(String args[])
    {
        boolean b = true;
        char c = 'a';
        int i = 10;
        float f = 3.1416f;
        double d = 2.54123;

        System.out.printf("boolean = %b\n",b);
        System.out.printf("char c = %c\n",c);
        System.out.printf("int = %d\n",i);
        System.out.printf("float = %.2f\n",f);
        System.out.printf("double = %f\n",d);
    }
}