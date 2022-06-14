public class SharedDigit
{
    public static boolean hasSharedDigit(int a, int b){
        if(a<=(99) && a>=10 && b<=(99) && b>=10){
           int lefta = a/10;
           int righta = a % 10;
           int leftb = b/10;
           int rightb = b % 10;
           if(lefta == leftb || lefta == rightb || righta == leftb || righta ==rightb){
              return true;  
      } 
        }
        return false;
    }
    public static void main(String args[])
    {
        System.out.println(SharedDigit.hasSharedDigit(12, 23));
        System.out.println(SharedDigit.hasSharedDigit(9, 99));
        System.out.println(SharedDigit.hasSharedDigit(15, 55));
        System.out.println(SharedDigit.hasSharedDigit(12, 43));
    }    
}
