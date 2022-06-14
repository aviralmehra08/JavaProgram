public class SumOddRange
{
    public static boolean isOdd(int number)
    {
        if(number>0)
        {
            if(number%2!=0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
    public static int sumOdd(int start, int end)
    {
        if(end>=start && (start>=0 && end>=0))
        {
            int sum=0;
            for(int x=start;x<=end;x++)
            {
                if(isOdd(x))
                {
                    sum=sum+x;
                }
            }
            System.out.println(sum);
            return sum;
        }
        else
        {
            System.out.println("-1");
            return -1;
        }
    }
    public static void main(String args[])
    {
        sumOdd(1, 100);
        sumOdd(-1, 100);
        sumOdd(100, 100);
        sumOdd(13, 13);
        sumOdd(100, -100);
        sumOdd(100, 1000);
    }    
}
