public class MissingNumber2
{
    public static void printmissingElements(int array[])
    {
        int diff=array[0]-0;
        for(int x=0;x<array.length;x++)
        {
            if(array[x]-x!=diff)
            {
                while(diff<array[x]-x)
                {
                    System.out.println((x+diff)+" ");
                    diff++;
                }
            }
        }
    }
    public static void main(String args[])
    {
        int array[]={6,7,10,11,13,14,16,20};
        printmissingElements(array);
    }    
}
