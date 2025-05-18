import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static String REGEX = "[!,?.\\_'@]+";  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputLine = sc.nextLine();
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(inputLine);
        inputLine = m.replaceAll(" ");
        StringTokenizer st = new StringTokenizer(inputLine);        
        System.out.println(st.countTokens());
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
