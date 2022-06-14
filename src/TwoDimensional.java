import java.util.Arrays;

public class TwoDimensional
{
    public static void main(String args[])
    {
        int array[][]=new int[2][2];
        array[0][0]=1;
        array[0][1]=2;
        array[1][0]=3;
        array[1][1]=4;
        System.out.println(Arrays.deepToString(array));
        int array1[][]={{5,3},{2,0}};
        System.out.println(Arrays.deepToString(array1));
    }   
}
