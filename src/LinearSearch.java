public class LinearSearch
{
    public void linearsearch(int array[],int number)
    {
        for(int x=0;x<array.length;x++)
        {
            if(array[x]==number)
            {
                System.out.println("Number found at index "+x);
                return;
            }
        }
        System.out.println("Value not found");
    }
    public static void main(String args[])
    {
        LinearSearch l=new LinearSearch();
        int array[]={1,2,3,4,5,6};
        l.linearsearch(array, 6);
    }
}
