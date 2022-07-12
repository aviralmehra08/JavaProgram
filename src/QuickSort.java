public class QuickSort
{
	public static int partition(int arr[], int start, int end)
	{
		int pivot=end;
		int i=start-1;
		for(int j=start;j<=end;j++)
		{
			if(arr[j]<=arr[pivot])
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		return i;
	}
	public static void quickSort(int arr[], int start, int end)
	{
		if(start<end)
		{
			int pivot=partition(arr,start,end);
			quickSort(arr,start,pivot-1);
			quickSort(arr,pivot+1,end);
		}
	}
	public static void print(int arr[])
	{
		for(int x=0;x<arr.length;x++)
		{
			System.out.print(arr[x]+" ");
		}
	}
	public static void main(String args[])
	{
		int array[]= {10,3,2,7,7,5,8,4,1,2,9,7,8,11};
		QuickSort.quickSort(array, 0, array.length-1);
		QuickSort.print(array);
	}
}
