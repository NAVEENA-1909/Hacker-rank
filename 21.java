import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);		
		int[][] ar = new int[6][6];
		for (int i = 0; i < 6; i++) {
			String[] t = in.nextLine().split(" ");
			for (int j = 0; j < 6; j++) {
				ar[i][j] = Integer.valueOf(t[j]);
			}
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int sum = sum(ar, i, j);
				if (sum > max) max = sum;
			}
		}
		System.out.println(max);
    }
    private static int sum(int[][] ar, int i, int j) {
		int s = 0;
		for (int x = 0; x < 3; x++) {
			s += ar[i][j+x];
		}
		for (int x = 0; x < 3; x++) {
			s += ar[i+2][j+x];
		}
		return s + ar[i+1][j+1];
	}
}
