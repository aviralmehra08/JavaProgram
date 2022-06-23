import java.util.Arrays;

public class MergeSortedArray
{
    public void merge(int nums1[], int m, int nums2[], int n)
    {
        int result[]=new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n)
        {
            if(nums1[i]<nums2[j])
            {
                result[k]=nums1[i];
                i++;
                k++;
            }
            else
            {
                result[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<m)
        {
            result[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n)
        {
            result[k]=nums2[j];
            j++;
            k++;
        }
        nums1=result;
        System.out.println(Arrays.toString(nums1));
    }
    public static void main(String args[])
    {
        int nums1[]={1,2,3,0,0,0};
        int nums2[]={2,5,6};
        MergeSortedArray m=new MergeSortedArray();
        m.merge(nums1, 3, nums2, 3);
    }    
}
