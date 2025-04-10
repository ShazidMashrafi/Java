import java.util.Scanner;

public class BMI
{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        float height,weight;
        System.out.print("Enter height in inches: ");
        height = input.nextFloat();
        System.out.print("Enter weight in pounds: ");
        weight = input.nextFloat();

        double bmi = 703*weight/(height*height);
        input.close();

        if(bmi<=16.00)
            System.out.println("Starvation");
        else if(bmi<17.00)
            System.out.println("emaciation");
        else if(bmi<18.50)
            System.out.println("underweight");
        else if(bmi<23.00)
            System.out.println("normal, low range");
        else if(bmi<25)
            System.out.println("normal, high range");
        else if(bmi<27.50)
            System.out.println("overweight, low range");
        else if(bmi<30)
            System.out.println("overweight, high range");
        else if(bmi<35)
            System.out.println("1st degree obesity");
        else if(bmi<40)
            System.out.println("2nd degree obesity");
        else
            System.out.println("3rd degree obesity");
    }
}