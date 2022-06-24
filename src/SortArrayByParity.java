import java.util.Arrays;

public class SortArrayByParity
{
    public int[] sortArrayByParity(int nums[])
    {
        int left=0;
        int right=nums.length-1;
        int result[]=new int[nums.length];
        for(int x=0;x<nums.length;x++)
        {
            if(nums[x]%2==0)
            {
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                result[left++]=nums[x];
            }
            else if(nums[x]%2!=0)
            {
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                result[right--]=nums[x];
            }
        }
        return result;
    }
    public static void main(String args[])
    {
        SortArrayByParity s=new SortArrayByParity();
        int nums[]={3,1,2,4};
        System.out.println(Arrays.toString(s.sortArrayByParity(nums)));
    }    
}
