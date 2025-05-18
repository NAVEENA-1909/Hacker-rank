import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();                
        System.out.printf("US format = %s\n",NumberFormat.getCurrencyInstance(Locale.US).format(payment));
        System.out.printf("India format = %s\n",NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment));
    }
}
