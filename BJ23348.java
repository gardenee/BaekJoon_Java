import java.util.Scanner;

public class BJ23348 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] weight = new int[3]; // 가중치 기록해둘 배열
        for (int i = 0; i < 3; i++) {
            weight[i] = sc.nextInt();
        }

        int max = 0; // 최댓값 저장할 정수
        int T = sc.nextInt(); // 테스트케이스 수

        for (int i = 0; i < T; i++) { // for문 한 번 돌 때 한 팀 점수 총합 구함
            int[] thisTeam = new int[3]; // 각각의 종목 점수 기록할 배열
            for (int j = 0; j < 3; j++) { // 각각의 팀원에 대해서
                for (int k = 0; k < 3; k++) {
                    thisTeam[k] += sc.nextInt();
                }
            }

            int temp = 0; // 이 팀의 점수
            for (int j = 0; j < 3; j++) {
                temp += thisTeam[j] * weight[j]; // 가중치 * 점수합
            }

            if (temp > max) { // 이 팀의 점수가 최대값이면 최대값 갱신
                max = temp;
            }
        }
        System.out.println(max);
    }
}
