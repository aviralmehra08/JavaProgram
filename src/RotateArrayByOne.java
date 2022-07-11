import java.util.Arrays;

public class RotateArrayByOne
{
    static int arr[]=new int[] {1, 2, 3, 4, 5};
	public static void rotate()
	{
		int i=arr[arr.length-1];
		for(int x=arr.length-1;x>0;x--)
		{
			arr[x]=arr[x-1];
		}
		arr[0]=i;
	}
	public static void main(String args[])
	{
		System.out.println("Given Array is ");
		System.out.println(Arrays.toString(arr));
		rotate();
		System.out.println("Final Array is ");
		System.out.println(Arrays.toString(arr));
	}   
}
