import java.util.*;

public class BJ10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        int[] answer = new int[26];   // 답 저장할 배열
        for (int i = 0; i < answer.length; i++) {
            answer[i] = -1;
        }
        String ref = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < line.length(); i++) {
            if (answer[ref.indexOf(line.substring(i, i+1))] == -1) {
                answer[ref.indexOf(line.substring(i, i+1))] = i;
            }
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }

    }
}
