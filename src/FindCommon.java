import java.util.*;
public class FindCommon
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<n1 && j<n2 && k<n3)
        {
            if(A[i] == B[j] && B[j] == C[k])
            {
                if(!list.contains(A[i]))
                {
                    list.add(A[i]);
                }
                    i++;
                    j++;
                    k++;
            }
            else if(A[i]>B[j])
            {
                j++;
            }
            else if(A[i]>C[k])
            {
                k++;
            }
            else
            {
                i++;
            }
        }
        if(list.size() == 0)
        {
           list.add(-1);
        }
        return list;
    }    
}
