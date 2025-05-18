import java.util.*;
public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int j=s.nextInt();
        for(int i=1;i<=10;i++)
        {
            int k=j*i;
            System.out.println(j+" x "+i+" = "+k);
        }
    }
}
