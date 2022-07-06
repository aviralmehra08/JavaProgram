import java.util.*;
public class ReverseArray
{
    public static void reverseArray(int arr[], int start, int end)
    {
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }    
    public static void print(int arr[], int size)
    {
        for(int x=0;x<size;x++)
        {
            System.out.print(arr[x]+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
            }
            reverseArray(arr, 0, n-1);
            print(arr, n);
        }
        sc.close();
    }
}
