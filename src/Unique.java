public class Unique
{
    public boolean isUnique(int array[])
    {
        for(int x=0;x<array.length;x++)
        {
            for(int y=x+1;y<array.length;y++)
            {
                if(array[x]==array[y])
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Unique u=new Unique();
        int array[]={1,2,3,7,5,6};
        boolean result=u.isUnique(array);
        System.out.println(result);
    }    
}
