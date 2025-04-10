import java.util.Scanner;
class RectangleArea
{
    Scanner input = new Scanner(System.in);
    int length,width,area;
    void getData()
    {
        System.out.print("Enter the sides of the array: ");
        length = input.nextInt();
        width = input.nextInt();
    }
    void computeField()
    {
        area=length*width;
    }
    void fieldDisplay()
    {
        System.out.println("The area of the rectangle is: "+area);
    }
}

public class Rectangle
{
    public static void main(String []args)
    {
        RectangleArea rectangle = new RectangleArea();
        rectangle.getData();
        rectangle.computeField();
        rectangle.fieldDisplay();
    }
}