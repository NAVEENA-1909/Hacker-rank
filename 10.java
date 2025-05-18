import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Math.abs(sc.nextInt()); 
        int firstDigit = number / 1000;
        int lastDigit = number % 10;
        System.out.println(firstDigit + lastDigit);
    }
}
