public class ThirdMaximumNumber
{
    public int thirdMax(int nums[])
    {
        int first=nums[0];
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;
        for(int x=1;x<nums.length;x++)
        {
            if(nums[x]>first)
            {
                first=nums[x];
            }
        }
        for(int x=0;x<nums.length;x++)
        {
            if(nums[x]>second && nums[x]<first)
            {
                second=nums[x];
            }
        }
        for(int x=0;x<nums.length;x++)
        {
            if(nums[x]>third && nums[x]<second)
            {
                third=nums[x];
            }
        }
        System.out.println(third);
        return third;
    }    
    public static void main(String args[])
    {
        ThirdMaximumNumber t=new ThirdMaximumNumber();
        int nums[]={2,2,3,1};
        t.thirdMax(nums);
    }
}
