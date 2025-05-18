import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        for(int i = 0; i<j;i++)
        {
            String l = sc.next();
            try
            {
            	
            	if(Long.parseLong(l) >= -Math.pow(2, 63) && Long.parseLong(l) <= Math.pow(2, 63))
                {
                	System.out.println(l+ " can be fitted in:");
                }
            	if(Long.parseLong(l) == 0 || Long.parseLong(l) == 1)
            	{
            		System.out.println("* boolean");
            	}
            	if(Long.parseLong(l) >= -Math.pow(2, 7) && Long.parseLong(l) <= Math.pow(2, 7)-1)
                {
            		
                    System.out.println("* byte");
                }
            	if(Long.parseLong(l) >= -Math.pow(2, 15) && Long.parseLong(l) <= Math.pow(2, 15)-1)
                {
                    System.out.println("* short");
                }
            	if(Long.parseLong(l) >= -Math.pow(2, 31) && Long.parseLong(l) <= Math.pow(2, 31)-1)
                {
                    System.out.println("* int");
                }
            	if(Long.parseLong(l) >= -Math.pow(2, 63) && Long.parseLong(l) <= Math.pow(2, 63)-1)
                {
                    System.out.println("* long");
                }
            }
            catch(Exception e)
                {
                System.out.println(l+" can't be fitted anywhere.");
                }
            }
    }
}
