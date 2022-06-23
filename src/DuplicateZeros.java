import java.util.Arrays;

public class DuplicateZeros
{
    public static void duplicate(int array[])
    {
        for(int x=0;x<array.length;x++)
        {
            if(array[x]==0)
            {
                int j=array.length-1;
                while(j>x)
                {
                    array[j]=array[j-1];
                    j--;
                }
                array[x+1]=0;
                x++;
            }
        }
    }
    public static void main(String args[])
    {
        int array[]={1,2,0,3,0,4,5};
        DuplicateZeros.duplicate(array);
        System.out.println(Arrays.toString(array));
    }    
}
