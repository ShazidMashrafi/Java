import java.util.Scanner;

public class Basic
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int[] number; // Declaration
        number = new int[10]; // Creation

        String[] names = new String[10]; // Declaration and Creation

        number[3] = input.nextInt();
        names[5]="Shazid";

        int len = number.length;
        System.out.println("Size of array : "+len);

        System.out.println("Number[3]: "+number[3]);
        System.out.println("Names[5]: "+names[5]);
        input.close();
    }
}