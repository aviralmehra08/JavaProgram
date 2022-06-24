import java.util.Arrays;

public class SquaresofSortedArray
{
    public int[] sortedsquares(int nums[])
    {
        int result[]=new int[nums.length];
        for(int x=0;x<nums.length;x++)
        {
            nums[x]=(int) Math.pow(nums[x],2);
        }
        result=nums;
        Arrays.sort(result);
        return result;
    }
    public static void main(String args[])
    {
        SquaresofSortedArray s=new SquaresofSortedArray();
        int nums[]={-7,-3,2,3,11};
        s.sortedsquares(nums);
        System.out.println(Arrays.toString(nums));
    }    
}
