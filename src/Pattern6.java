import java.util.Scanner;
public class Pattern6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int x=1;x<=n;x++)
        {
            for(int y=x;y<=3;y++)
            {
                System.out.print(" ");
            }
            for(int y=1;y<=x;y++)
            {
                System.out.print("*");
            }
            for(int y=x-1;y>=1;y--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int x=n-1;x>=1;x--)
        {
            for(int y=x;y<=2;y++)
            {
                System.out.print(" ");
            }
            for(int y=1;y<=x;y++)
            {
                System.out.print("*");
            }
            for(int y=x-1;y>=1;y--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
