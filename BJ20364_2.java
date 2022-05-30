import java.io.*;
import java.util.*;

public class BJ20364_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String ipt = br.readLine();
        StringTokenizer st = new StringTokenizer(ipt);
        int N = Integer.parseInt(st.nextToken()); 
        int Q = Integer.parseInt(st.nextToken()); 

        int[] property = new int[N+1]; // 땅이 비어있으면 0, 입주중이면 1 저장할 배열

        for (int i=1; i<=Q; i++) {
            int curr = Integer.parseInt(br.readLine()); 
            int recent = -1; 
            recent = search(curr, recent, property);
            if (recent==-1) { 
                property[curr] = 1; 
                recent = 0; 
            }
            bw.write(recent + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static int search(int curr, int recent, int[] property) { 
        if (curr == 0) return recent; 
        if (property[curr] == 1) recent = curr;
        return search(curr/2, recent, property);
    }
}
