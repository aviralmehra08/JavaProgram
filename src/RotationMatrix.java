import java.util.Scanner;

public class RotationMatrix
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int x=0;x<arr.length;x++)
        {
            for(int y=0;y<arr.length;y++)
            {
                arr[x][y]=sc.nextInt();
            }
        }
        //transpose
        for(int x=0;x<arr.length;x++)
        {
            for(int y=x;y<arr[0].length;y++)
            {
                int temp=arr[x][y];
                arr[x][y]=arr[y][x];
                arr[y][x]=temp;
            }
        }
        //reverse
        for(int x=0;x<arr.length;x++)
        {
            int li=0;
            int ri=arr[x].length-1;
            while(li<ri)
            {
                int temp=arr[x][li];
                arr[x][li]=arr[x][ri];
                arr[x][ri]=temp;
                li++;
                ri--;
            }
        }
        display(arr);
        sc.close();
    }
    public static void display(int arr[][])
    {
        for(int x=0;x<arr.length;x++)
        {
            for(int y=0;y<arr[0].length;y++)
            {
                System.out.print(arr[x][y]+" ");
            }
            System.out.println();
        }
    }    
}
