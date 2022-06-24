import java.util.*;
public class DisappearedNumbers
{
    public List<Integer> findDisappearedNumbers(int[] nums)
    {
        
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++)
        {
            while(nums[i] != i+1 && nums[i] != nums[nums[i]-1])
            {
                int temp = nums[i];
                nums[i] = nums[nums[i]-1];
                nums[temp-1] = temp;
            }
        }
        for (int i = 0; i < nums.length; i++)
        {
            if(nums[i] != i+1)
            {
                res.add(i+1);
            }
        }
        return res;
    }    
}
