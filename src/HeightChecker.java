import java.util.Arrays;

public class HeightChecker
{
    public int heightChecker(int heights[])
    {
        int count=0;
        int result[]=new int[heights.length];
        for(int x=0;x<heights.length;x++)
        {
            result[x]=heights[x];
        }
        Arrays.sort(heights);
        for(int x=0;x<heights.length;x++)
        {
            if(result[x]!=heights[x])
            {
                count++;
            }
        }
        return count;
    } 
    public static void main(String args[])
    {
        HeightChecker h=new HeightChecker();
        int heights[]={1,1,4,2,1,3};
        h.heightChecker(heights);
        System.out.println(Arrays.toString(heights));
    } 
}
