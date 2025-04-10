import java.util.Scanner;

public class Taking_input
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int[] arr = new int[len];
        int sum=0;
        for(int i=0; i<len; ++i)
        {
            arr[i]= input.nextInt();
            sum += arr[i];
        }
        for(int i=0; i<len; ++i)
            System.out.print(arr[i]+" ");
        System.out.println("");
        
        System.out.println("Sum of the elements: "+sum);
        input.close();
    }
}