import java.util.Scanner;
public class Average 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int sum = 0, ct = 0;
        while(true)
        {
            int x = scan.nextInt();
            if(x<0)
                break;
            sum +=x;
            ct++;
        }
        double avg = (double)sum/ct;
        System.out.printf("Average: %.2f",avg);
        scan.close();
    }
}
