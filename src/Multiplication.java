public class Multiplication
{
    public static int multiply(int a, int b)
    {
        if(a==0 || b==0)
        {
            return 0;
        }
        if(a>0 && b>0)
        {
            return a+multiply(a, b-1);
        }
        if(a<0 || b<0)
        {
            return -multiply(a, -b);
        }
        return -1;
    }    
    public static void main(String[] args) {
        int ans=multiply(2, 3);
        System.out.println(ans);
    }
}
