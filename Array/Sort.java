import java.util.Arrays;

public class Sort
{
    public static void main(String[] args)
    {
        int[] number = {10,-3,18,5,25};
        Arrays.sort(number);
        for(int x:number)
            System.out.print(x+" ");
    }
}