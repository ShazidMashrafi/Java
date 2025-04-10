public class Math_class
{
    public static void main(String[] args)
    {
        int a=20, b = 10;
        int min = Math.min(a,b);
        System.out.println("Minimum : "+min);
        
        int max = Math.max(a,b);
        System.out.println("Maximum : "+max);

        int abs = Math.abs(b-a);
        System.out.println("Abs of b - a : "+abs);

        int x=2,y=5;
        double power = Math.pow(x,y);
        System.out.printf("%d to the power %d is : %.2f", x,y,power);
    }
}