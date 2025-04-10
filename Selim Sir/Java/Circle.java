import java.util.Scanner;

public class Circle
{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        double cir = 2*3.14159*r;
        double area = 3.14159*r*r;
        System.out.printf("The area is %.2f and circumference is %.2f",area,cir);
        
        input.close();
    }
}