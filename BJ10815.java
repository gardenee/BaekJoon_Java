import java.io.*;
import java.util.*;

public class BJ10815 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String, Integer> have = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        String ipt = br.readLine();
        StringTokenizer st = new StringTokenizer(ipt);
        for (int i = 0; i < N; i++) {
            have.put(st.nextToken(), 1);
        }

        int M = Integer.parseInt(br.readLine());
        ipt = br.readLine();
        st = new StringTokenizer(ipt);
        for (int i = 0; i < M; i++) {
            String find = st.nextToken();
            if (have.containsKey(find)) bw.write("1 ");
            else bw.write("0 ");
        }
        bw.flush();
        bw.close();
    }
}
