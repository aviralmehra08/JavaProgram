public class InsertionArray
{
    int arr[]=null;
    public InsertionArray(int size)
    {
        arr=new int[size];
        for(int x=0;x<arr.length;x++)
        {
            arr[x]=Integer.MIN_VALUE;
        }
    }
    public void insert(int location,int value)
    {
        try
        {
            if(arr[location]==Integer.MIN_VALUE)
            {
                arr[location]=value;
                System.out.println("Successfully Inserted");
            }
            else
            {
                System.out.println("Cell is already occupied");
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid Index");
        }
    }
    public static void main(String args[])
    {
        InsertionArray i=new InsertionArray(10);
        i.insert(0, 0);
        i.insert(1, 10);
        i.insert(2, 20);
        i.insert(1, 30);
        i.insert(12, 120);
    }
}
