public class MaxProduct
{
    public String max(int array[])
    {
        int max=0;
        String pairs="";
        for(int x=0;x<array.length;x++)
        {
            for(int y=x+1;y<array.length;y++)
            {
                if(array[x]*array[y]>max)
                {
                    max=array[x]*array[y];
                    pairs=Integer.toString(array[x])+","+Integer.toString(array[y]);
                }
            }
        }
        return pairs;
    }
    public static void main(String args[])
    {
        MaxProduct m=new MaxProduct();
        int array[]={10,60,30,40,50};
        String result=m.max(array);
        System.out.println(result);
    }    
}
