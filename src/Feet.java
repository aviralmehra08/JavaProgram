public class Feet
{
    public static double calcFeetAndInchesToCentimeters(double feet, double inches)
    {
        if(feet>=0 && (inches>=0 && inches<=12))
        {
            double f=feet*30.48;
            double inch=inches*2.54;
            double finalvalue=f+inch;
            System.out.println(finalvalue);
            return finalvalue;
        }
        else
        {
            return -1;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inches)
    {
        if(inches>=0)
        {
            double f=(int) inches/12;
            double remaininginches=(int) inches%12;
            System.out.println(inches + "inches is equal to "+ f + " feet and "+ remaininginches);
            return calcFeetAndInchesToCentimeters(f,remaininginches);
        }
        else
        {
            return -1;
        }
    } 
    public static void main(String args[])
    {
        double centimeters=calcFeetAndInchesToCentimeters(6, 13);
        if(centimeters<0.0)
        {
            System.out.println("Invalid Parameters");
        }
        calcFeetAndInchesToCentimeters(100);
    } 
}
