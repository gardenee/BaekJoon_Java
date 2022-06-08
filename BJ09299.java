import java.io.*;
import java.util.StringTokenizer;

public class BJ09299 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            String ipt = br.readLine();
            StringTokenizer st = new StringTokenizer(ipt);
            int m = Integer.parseInt(st.nextToken());
            bw.write("Case " + i + ": " + (m-1));

            for (int j = 0; j < m; j++) {
                bw.write(" " + (m-j) * Integer.parseInt(st.nextToken()));
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
