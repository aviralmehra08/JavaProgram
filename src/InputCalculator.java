import java.util.Scanner;
public class InputCalculator
{
    public static void printThenSumAndAverage()
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int average=0;
        int count=0;
        while(sc.hasNextInt())
        {
            int number=sc.nextInt();
            count++;
            sum=sum+number;
        }
        average=sum/count;
        System.out.println("SUM = "+sum+" AVG = "+average);
        sc.close();
    }
    public static void main(String args[])
    {
        InputCalculator.printThenSumAndAverage();
    }    
}
