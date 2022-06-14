public class EvenDigitSum 
{
    public static int getEvenDigitSum(int number)
    {
        if(number>=0)
        {
            int sum=0;
            while(number!=0)
            {
                int d=number%10;
                if(d%2==0)
                {
                    sum=sum+d;
                }
                number=number/10;
            }
            return sum;
        }
        else
        {
            return -1;
        }
    }
    public static void main(String args[])
    {
        System.out.println(EvenDigitSum.getEvenDigitSum(123456789));
        System.out.println(EvenDigitSum.getEvenDigitSum(252));
        System.out.println(EvenDigitSum.getEvenDigitSum(-22));
        System.out.println(EvenDigitSum.getEvenDigitSum(0));
    }    
}
