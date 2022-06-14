public class GreatestCommonDivisor
{
    public static int getGreatestCommonDivisor(int first, int second)
    {
        int div;
        int r;
        if(first>=10 && second>=10)
        {
            while(first != 0){
               div =  second/first;
               r = second%first;
               second = first;
               first = r;
            }
            return second;
        }
        return -1;
    }
    public static void main(String args[])
    {
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(25, 15));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(12, 30));
    }    
}
