public class FlourPacker
{
    public static  boolean canPack(int bigCount, int smallCount, int goal)
    {
        if(bigCount<0 || smallCount<0 || goal<0)
        {
            return false;
        }
        else
        {
            int i=0;
            while(i<bigCount && goal-5>=0)
            {
                goal=goal-5;
                i++;
            }
            return smallCount>=goal;
        }
    }
    public static void main(String args[])
    {
        System.out.println(FlourPacker.canPack(-3, 2, 12));   
    }    
}
