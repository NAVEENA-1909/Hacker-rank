import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.next();
        int k = scan.nextInt();        
        String min = null;
        String max = null;       
        for(int i = 0; i < string.length() - k + 1; i++) {          
            String sub = string.substring(i, i+k);
            
            if(min == null) {
                min = sub;
            } else {
                
                if(min.compareTo(sub) > 0) {
                    min = sub;
                }
                
            }
            
            if(max == null) {
                max = sub;
            } else {
                
                if(max.compareTo(sub) < 0) {
                    max = sub;
                }
                
            }
            
        }
        System.out.println(min);
        System.out.println(max);
    }
}
