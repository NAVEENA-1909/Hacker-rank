import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class JavaList {
    public static void main(String[] args) {
        	try (Scanner sc = new Scanner(System.in)) {
    		int n = sc.nextInt();
    		ArrayList<Integer> l = new ArrayList<>(8000);
    		for (int i = 0; i < n; i++) {
    			l.add(sc.nextInt());
    		}
    		int q = sc.nextInt();
    		for (int i = 0; i < q; i++) {
    			sc.nextLine();
    			if (sc.next().equals("Insert")) {
    				l.add(sc.nextInt(), sc.nextInt());
    			} else {
    				l.remove(sc.nextInt());
    			}
    		}
    		for (Integer integer : l) {
    			System.out.print(integer);
    			System.out.print(" ");
			}
    	}
    }
}
