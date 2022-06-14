import java.util.Arrays;

public class Pairs
{
    public int[] pairs(int array[],int target)
    {
        for(int x=0;x<array.length;x++)
        {
            for(int j=x+1;j<array.length;j++)
            {
                if(array[x]+array[j]==target)
                {
                    return new int[] {x,j};
                }
            }
        }
        throw new IllegalArgumentException("No solution found");
    }
    public static void main(String args[])
    {
        Pairs p=new Pairs();
        int array[]={2,7,13,15};
        int result[]=p.pairs(array, 17);
        System.out.println(Arrays.toString(result));
    }    
}
