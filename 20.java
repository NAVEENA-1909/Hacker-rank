import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger b1 = new BigInteger(sc.next());
        BigInteger b2 = new BigInteger(sc.next());
        BigInteger sum = new BigInteger("0");
        BigInteger pro = new BigInteger("1");
        sum = sum.add(b1);
        sum = sum.add(b2);
        System.out.println(sum);
        pro = pro.multiply(b1);
        pro = pro.multiply(b2);
        System.out.println(pro);
    }
}
