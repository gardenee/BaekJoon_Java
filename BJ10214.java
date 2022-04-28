import java.util.Scanner;

public class BJ10214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트케이스의 수
        int Y; // 연세대 점수 기록
        int K; // 고려대 점수 기록

        for (int i = 0; i < T; i++) { // 각각의 테스트케이스
            Y = 0; // 점수 초기화
            K = 0;
            for (int j = 0; j < 9; j++) { // 9회동안 점수 저장
                Y += sc.nextInt();
                K += sc.nextInt();
            }

            if (Y > K) { // 승리팀 출력
                System.out.println("Yonsei");
            } else if (Y < K) {
                System.out.println("Korea");
            } else {
                System.out.println("Draw");
            }
        }
    }
}

/*
    사실 이 문제는 출제 의도에 따라서..
    System.out.println("Yonsei");
    한줄만 제출해도 정답처리된다ㅎ
*/
