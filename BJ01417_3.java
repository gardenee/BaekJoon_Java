import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BJ01417_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int me = Integer.parseInt(br.readLine());
        N--;

        ArrayList<Integer> votes = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            votes.add(Integer.parseInt(br.readLine()));
        }

        int count = 0;
        while (votes.size() > 0) {
            int curr = Collections.max(votes);
            if (me > curr) {
                break;
            } else {
                int idx = votes.indexOf(curr);
                votes.set(idx, curr-1);
                me++;
                count++;
            }
        }
        System.out.println(count);
    }
}
