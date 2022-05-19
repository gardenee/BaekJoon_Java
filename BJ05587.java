import java.util.*;

public class BJ05587 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> SG = new ArrayList<>();
        ArrayList<Integer> GS = new ArrayList<>();

        for (int i = 0; i < n; i++) { // SG 리스트에 상근이가 가진 카드 담기
            SG.add(sc.nextInt());
        }
        Collections.sort(SG); // SG 정렬

        for (int i = 1; i <= n * 2; i++) {  // GS 리스트에 상근이가 안가진 카드 담기(자동정렬)
            if (!SG.contains(i)) {
                GS.add(i);
            }
        }

        int turn = 1; // 상근이 턴이면 1, 근상이 턴이면 -1(상근이부터 시작)

        while (SG.size() != 0 && GS.size() != 0) { // 게임 한 판(카드가 없는 사람이 없을 때만)
            int curr; // 지금 책상에 놓여있는 카드
            ArrayList<Integer> now; // 지금 차례인 사람 카드 덱
            now = deck(turn, SG, GS);
            curr = now.get(0);
            now.remove(0); // 자기 차례인 사람이 제일 작은 카드를 낸다
            turn *= -1; // 다음 사람 차례

            while (SG.size() != 0 && GS.size() != 0) { // 게임 한 턴
                now = deck(turn, SG, GS); // 이번 턴 사람 카드덱

                int tmp = 0;
                for (int i = 0; i < now.size(); i++) { // 낼 수 있는 카드 찾기
                    tmp = now.get(i);
                    if (tmp > curr) { // 더 큰 카드가 있으면 내고, 상대방 턴
                        curr = tmp;
                        now.remove(i);
                        turn *= -1;
                        break; // for문에 대한 break
                    }
                }
                if (tmp < curr) { // 낼 카드가 없었던 경우
                    turn *= -1;
                    break;
                }
            }
        }
        System.out.println(GS.size());
        System.out.println(SG.size());
    }

    public static ArrayList<Integer> deck(int turn, ArrayList<Integer> SG, ArrayList<Integer> GS) {
        if (turn == 1) {
            return SG;
        } else {
            return GS;
        }
    }
}
