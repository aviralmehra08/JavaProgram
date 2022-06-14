public class FactorPrinter
{
    public static void printFactors(int number)
    {
        if(number<1){
            System.out.print("Invalid Value");
        }
        else
        {
            for(int i=1;i<=number;i++)
            {
                if(number%i == 0)
                {
                    System.out.print(""+i+" ");
                }
            }
        }
    }
    public static void main(String args[])
    {
        FactorPrinter.printFactors(6);
        FactorPrinter.printFactors(32);
        FactorPrinter.printFactors(10);
        FactorPrinter.printFactors(-1);
    }    
}
