import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();        
        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");       
        System.out.println(new StringBuilder().append(Character.toUpperCase(A.charAt(0))).append(A.subSequence(1,A.length())).append(" ").append( Character.toUpperCase(B.charAt(0))).append(B.subSequence(1,B.length())).toString());        
    }
}
