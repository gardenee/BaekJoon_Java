import java.io.*;
import java.util.StringTokenizer;

public class BJ01717 {

    public static int[] parents;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        parents = new int[n+1];

        for (int i = 1; i < n+1; i++) {
            parents[i] = i;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (cmd == 0) {
                union(a, b);

            } else if (cmd == 1) {
                if (findParents(a) == findParents(b)) {
                    bw.write("YES");
                } else {
                    bw.write("NO");
                }
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }

    public static int findParents(int i) {
        if (parents[i] == i) {
            return i;
        } else {
            return parents[i] = findParents(parents[i]);
        }
    }

    public static void union(int i, int j) {
        int a = findParents(i);
        int b = findParents(j);
        parents[b] = a;
    }
}
