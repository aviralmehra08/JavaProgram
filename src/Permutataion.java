public class Permutataion
{
    public boolean ispermutation(int array1[],int array2[])
    {
        if(array1.length!=array2.length)
        {
            return false;
        }
        int sum1=0;
        int sum2=0;
        int m1=1;
        int m2=1;
        for(int x=0;x<array1.length;x++)
        {
            sum1=sum1+array1[x];
            m1=m1*array1[x];
        }
        for(int x=0;x<array2.length;x++)
        {
            sum2=sum2+array2[x];
            m2=m2*array2[x];
        }
        if(sum1==sum2 && m1==m2)
        {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Permutataion p=new Permutataion();
        int array1[]={1,2,3,4,5};
        int array2[]={1,2,3,4,6,11};
        boolean result=p.ispermutation(array1, array2);
        System.out.println(result);
    }    
}
