import java.util.Scanner;
public class Pattern3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int x=1;x<=n;x++)
        {
            for(int y=x;y>=n;y++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }    
}
