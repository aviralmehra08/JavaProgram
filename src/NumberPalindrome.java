public class NumberPalindrome
{
    public static boolean isPalindrome(int number)
    {
        int reverse=number;
        int sum=0;
        while(number!=0)
        {
            int remainder=number%10;
            sum=(sum*10)+remainder;
            number=number/10;
        }
        if(sum==reverse)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        System.out.println(isPalindrome(1001));
    }
}
