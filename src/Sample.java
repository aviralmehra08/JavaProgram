import java.util.*;
import java.io.*;

public class Sample {
    public static int compare(String x, String y)
    {
        
        int l1=x.length();
        int l2=y.length();
        int lmin = Math.min(l1, l2);
        
        for(int i=0;i<lmin;i++)
        {
            char ch1= x.charAt(i);
            char ch2 = y.charAt(i);

            if(ch1!=ch2)
            {
                System.out.println("IMPOSSIBLE");
                break;
            }
            int str1_ch = (int)x.charAt(i);
            int str2_ch = (int)y.charAt(i);
  
            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }

        if (l1 != l2) 
            return l2 - l1;
        
          return 0;  
        
    }
    public static void main(String args[]) throws IOException
    {
        Scanner Sc= new Scanner(System.in);
        int t = Sc.nextInt();
        int z=0;
        
        String str1="",str2="";
        List<String> arr = new ArrayList<>();
        for(int i=0;i<t*2;i++)
        {
            arr.add(Sc.next());
           
        }
        

        for(int i=0;i<t*2;i+=2)
        {
            str1= arr.get(i);
            str2= arr.get(i+1);
            z=compare(str1,str2);
            if(z>0)
            System.out.println(z);

        }
        Sc.close();
    }
}