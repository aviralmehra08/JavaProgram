public class FirstRepeating
{
    public static int firstRepeating(int arr[], int n)
	{
		int arr1[]=new int[100000];
		for(int x=0;x<n;x++)
		{
			arr1[arr[x]]++;
		}
		for(int x=0;x<n;x++)
		{
			if(arr1[arr[x]]>=2)
			{
				return x+1;
			}
		}
		return -1;
	}
	public static void main(String args[])
	{
		int arr[]= {1, 2, 3, 4};
		int n=arr.length;
		int result=firstRepeating(arr, n);
		System.out.println(result);
	}    
}
