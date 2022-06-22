public class DiagonalStar
{
    public static void printSquareStar(int number)
    {
        if(number<5)
        {
            System.out.println("Invalid value");
        }
        else
        {
            for(int rows=1;rows<=number;rows++)
            {
                for(int columns=1;columns<=number;columns++)
                {
                    if(rows==1||columns==1||rows==number||columns==number)
                    {
                        System.out.print("*");
                    }
                    else if(rows==columns)
                    {
                        System.out.print("*");
                    }
                    else if(columns==(number-rows+1))
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
    public static void main(String args[])
    {
        DiagonalStar.printSquareStar(5);
    }    
}
