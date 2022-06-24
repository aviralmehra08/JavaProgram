public class NanditsDouble
{
    public boolean checkifExists(int arr[])
    {
        int count=0;
        for(int x=0;x<arr.length;x++)
        {
            for(int y=0;y<arr.length;y++)
            {
                if(x!=y && arr[x]==2*arr[y])
                {
                    count++;
                }
            }
        }
        if(count>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String arhs[])
    {
        NanditsDouble n=new NanditsDouble();
        int arr[]={3,1,7,11};
        boolean result=n.checkifExists(arr);
        System.out.println(result);
    }    
}
