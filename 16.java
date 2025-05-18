import java.io.*;
import java.util.*;
public class Solution {
    static boolean isAnagram(String A, String B) 
        char[] sortedA;
        char[] sortedB;
        sortedA = A.toUpperCase().toCharArray();
        Arrays.sort(sortedA);
        sortedB = B.toUpperCase().toCharArray();
        Arrays.sort(sortedB);
        return Arrays.equals(sortedA, sortedB);
    }
    public static void main(String[] args) {       
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");        
    }
}
