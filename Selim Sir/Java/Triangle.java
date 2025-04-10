import java.util.Scanner;

public class Triangle
{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        double s = (a+b+c)/2.0;
        double area = s*(s-a)*(s-b)*(s-c);
        area = Math.sqrt(area);
        System.out.printf("The area of the triangle is: %.2f",area);
        
        input.close();
        
    }
}