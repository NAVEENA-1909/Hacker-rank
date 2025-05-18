import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {       
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder A1=new StringBuilder(A);
          if(A.equals(""+A1.reverse())){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}
