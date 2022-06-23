
public class RemoveElement
{
    public int remove(int array[], int value)
    {
        int count=0;
        for(int x=0;x<array.length;x++)
        {
            if(array[x]!=value)
            {
                array[count++]=array[x];
            }
        }
        return count;
    }    
}
