import java.util.*;
import java.io.*;

public class BJ01764 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = br.readLine();
        StringTokenizer st = new StringTokenizer(num, " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> DJ = new HashSet<>();
        Set<String> BJ = new HashSet<>();

        for (int i = 0; i < N; i++) {
            DJ.add(br.readLine().trim().replace("\n", ""));
        }
        for (int i = 0; i < M; i++) {
            BJ.add(br.readLine().trim().replace("\n", ""));
        }

        DJ.retainAll(BJ);
        ArrayList<String> DBJ = new ArrayList<>(DJ);
        Collections.sort(DBJ);

        System.out.println(DBJ.size());
        for (String s: DBJ) {
            System.out.println(s);
        }
    }
}
