public class MountainArray
{
    public boolean isMountainArray(int array[])
    {
        int peak=-1;
        if(array.length<3)
        {
            return false;
        }
        for(int x=0;x<array.length-1;x++)
        {
            if(array[x]==array[x+1])
            {
                return false;
            }
            if(array[x]>array[x+1])
            {
                peak=x;
                break;
            }
        }
        if(peak<=0)
        {
            return false;
        }
        else
        {
            for(int x=peak;x<array.length-1;x++)
            {
                if(array[x]<=array[x+1])
                {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String args[])
    {
        MountainArray m=new MountainArray();
        int array[]={2,1};
        boolean result=m.isMountainArray(array);
        System.out.println(result);
    }    
}
