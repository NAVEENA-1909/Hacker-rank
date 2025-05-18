import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.io.BufferedReader;
import java.util.Map;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.StringTokenizer;
public class Solution {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		Task solver = new Task();
		solver.solve(1, in, out);
		out.close();
	}
}
class Task {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++)
            try {
                map.put(in.reader.readLine(), in.next());
            } catch (IOException e) {
                e.printStackTrace();
            }
        String q;
        try {
            while ((q=in.reader.readLine()) != null){
                if (map.containsKey(q)){
                    out.println(q + "=" + map.get(q));
                } else {
                    out.println("Not found");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;
    public InputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream), 32768);
        tokenizer = null;
    }
    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }
    public int nextInt() {
        return Integer.parseInt(next());
    }
}
