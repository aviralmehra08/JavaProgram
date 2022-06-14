public class FirstLastDigitSum
{
    public static int sumFirstAndLastDigit(int number)
    {
        if(number>=0)
        {
            int lastDigit=number%10;
            int firstDigit=0;
            while(number!=0)
            {
                firstDigit=number%10;
                number=number/10;
            }
            int sum=lastDigit+firstDigit;
            return sum;
        }
        else
        {
            return -1;
        }
    }
    public static void main(String args[])
    {
        System.out.println(sumFirstAndLastDigit(-10));
    }    
}
