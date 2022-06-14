public class PerfectNumber
{
    public static boolean isPerfectNumber(int number)
    {
        int sum=0;
        if(number>=1)
        {
            for(int x=1;x<number;x++)
            {
                if(number%x==0)
                {
                    sum=sum+x;
                }
            }
            if(sum==number)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        System.out.println(PerfectNumber.isPerfectNumber(6));
        System.out.println(PerfectNumber.isPerfectNumber(28));
    }    
}
