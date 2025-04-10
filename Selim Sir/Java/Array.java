import java.util.Scanner;
public class Array
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter the length of the array: ");
        n=input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i=0; i<n; ++i)
            arr[i]=input.nextInt();            
        int mx,mn; 
        mx=mn=arr[0];
        for(int i=0; i<arr.length; ++i)
        {
            if(mn>arr[i])
                mn = arr[i];
            if(mx<arr[i])
                mx = arr[i];
        }
        System.out.println("The minimum element of the array is "+mn);  
        System.out.println("The maximum element of the array is "+mx);
        input.close();
    }
}