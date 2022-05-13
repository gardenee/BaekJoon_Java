import java.util.*;
import java.io.*;

public class BJ01713_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] votes = new int[101]; // 투표수 저장할 해쉬맵
        List<Integer> display = new ArrayList<>(N); // 길이가 N인 전시장

        String ipt = br.readLine(); // 추천받기
        StringTokenizer st = new StringTokenizer(ipt);
        for (int i = 0; i < M; i++) {
            int curr = Integer.parseInt(st.nextToken()); // 지금 추천받은 학생

            if (votes[curr] == 0) { // 그림이 전시중이 아닌 경우
                if (display.size() == N) { // 이미 전시품이 꽉 참
                    int min = 0;
                    for (int j = 0; j < N; j++) { // 가장 투표수 적은 경우 찾기(동점이면 앞에 거)
                        if (votes[display.get(j)] < votes[display.get(min)]) {
                            min = j;
                        }
                    }
                    votes[display.get(min)] = 0; // 쫓겨나는 그림은 투표수 0
                    display.remove(min);
                }
                display.add(curr); // 전시장 맨 뒤에 지금 그림 전시
            }
            votes[curr]++; // 모든 경우에 지금 그림 투표수 1 증가
        }

        Collections.sort(display); // 최종 전시된 작품 오름차순 정렬
        for (int i: display) {
            System.out.print(i + " ");
        }
    }
}
