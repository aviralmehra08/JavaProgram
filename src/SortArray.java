import java.util.*;
public class SortArray
{
    public static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        int myIntegers[]=getIntegers(5);
        int sorted[]=sortedArray(myIntegers);
        printarray(sorted);
    }    
    public static int[] getIntegers(int capacity)
    {
        int array[]=new int[capacity];
        System.out.println("Enter "+capacity+" integer values:\r");
        for(int x=0;x<array.length;x++)
        {
            array[x]=sc.nextInt();
        }
        return array;
    }
    public static void printarray(int array[])
    {
        for(int x=0;x<array.length;x++)
        {
            System.out.println("Element "+x+" contains "+array[x]);
        }
    }
    public static int[] sortedArray(int array[])
    {
        int finalarray[]=new int[array.length];
        for(int x=0;x<array.length;x++)
        {
            finalarray[x]=array[x];
        }
        for(int x=0;x<finalarray.length-1;x++)
        {
            for(int y=0;y<finalarray.length-1;y++)
            {
                if(finalarray[y]<finalarray[y+1])
                {
                    int temp=finalarray[y];
                    finalarray[y]=finalarray[y+1];
                    finalarray[y+1]=temp;
                }
            }
        }
        return finalarray;
    }
}
