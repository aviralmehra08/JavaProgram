public class PeakElement
{
    public int peakElementUntil(int arr[], int low, int high, int n)
    {
        int mid=(low+high)/2;
        if((mid==0 || arr[mid-1]<=arr[mid])&& (mid==n-1 || arr[mid+1]<=arr[mid]))
        {
            return mid;
        }
        else if(mid>0 && arr[mid-1]>arr[mid])
        {
            return peakElementUntil(arr, low, mid-1, n);
        }
        else
        {
            return peakElementUntil(arr, mid+1, high, n);
        }
    }
    public int peak(int arr[], int n)
    {
        return peakElementUntil(arr, 0, n-1, n);
    }
    public static void main(String args[])
    {
        PeakElement p=new PeakElement();
        int arr[]={1,2,3};
        int result=p.peak(arr, 3);
        System.out.println(result);
    }
}