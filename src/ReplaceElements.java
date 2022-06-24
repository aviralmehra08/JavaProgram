import java.util.Arrays;

public class ReplaceElements
{
    public int[] replaceElements(int arr[])
    {
        int max = -1;
        for(int i =  arr.length-1; i >= 0; i--)
        {
            int temp = arr[i];
            arr[i] = max;
            if(max < temp)
            {
                max = temp;
            }
        }
        return arr;
    } 
    public static void main(String args[])
    {
        ReplaceElements r=new ReplaceElements();
        int arr[]={17,18,5,4,6,1};
        System.out.println(Arrays.toString(r.replaceElements(arr)));
    }   
}
