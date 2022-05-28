import java.io.*;
import java.util.*;

public class BJ20364 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String ipt = br.readLine();
        StringTokenizer st = new StringTokenizer(ipt);
        int N = Integer.parseInt(st.nextToken()); // 땅의 수
        int Q = Integer.parseInt(st.nextToken()); // 꽥꽥이의 수

        Set<Integer> occupied = new HashSet<>(); // 주인 있는 땅 저장

        for (int i=1; i<=Q; i++) {
            int curr = Integer.parseInt(br.readLine()); // 지금 위치
            int recent = curr+1; // 가장 최근에 방문한 주인 있는 땅
            recent = search(curr, recent, occupied);
            if (recent==curr+1) { // 주인있는 땅을 안밟았다면
                occupied.add(curr); // 내 땅 이제부터 주인 있음
                recent = 0;
            }
            bw.write(recent + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static int search(int curr, int recent, Set<Integer> visited) { // 내가 원하는 땅부터 부모로 거슬러 올라가며 탐색
        if (curr == 0) return recent; // root인 1번 땅까지 다 살펴봄
        if (visited.contains(curr)) recent = curr;
        return search(curr/2, recent, visited);
    }
}
