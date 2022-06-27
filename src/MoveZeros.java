import java.util.Arrays;

public class MoveZeros
{
    public void movezeros(int nums[])
    {
        int k=0;
        for(int x=0;x<nums.length;x++)
        {
            if(nums[x]!=0)
            {
                nums[k++]=nums[x];
            }
        }
        while(k<nums.length)
        {
            nums[k++]=0;
        }
    }
    public static void main(String args[])
    {
        MoveZeros m=new MoveZeros();
        int nums[]={1,2,3,0,4,5};
        m.movezeros(nums);
        System.out.println(Arrays.toString(nums));
    }    
}
