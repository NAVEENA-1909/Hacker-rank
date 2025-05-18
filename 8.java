import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breath = sc.nextInt();
        
        int per = 2*(length+breath);
        int a = (length*breath);
        
        System.out.println("The required length is "+per+" m");
        System.out.println("The required area of carpet is "+a+" sqm");
    }
}
