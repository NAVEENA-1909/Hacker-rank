import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sums[] = new int[n+1];
        sums[0] = 0;       
        for (int i=1;i<=n;++i) 
            sums[i] = sums[i-1] + sc.nextInt();           
        int s = 0;
        for (int i=1;i<=n;++i)
            for (int j=i;j<=n;++j)
                if (sums[j]-sums[i-1]<0) s++;
        System.out.println(s);
    }
}
