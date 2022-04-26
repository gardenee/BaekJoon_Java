import java.util.*;

public class BJ01316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int N = sc.nextInt();
        sc.nextLine();

        for (int j = 0; j < N; j++) {
            String word = sc.nextLine();
            String history = "";

            int flag = 1;
            for (int i = 1; i < word.length(); i++) {
                char current = word.charAt(i);
                char prev = word.charAt(i-1);
                if (prev != current) {
                    if (history.contains(String.valueOf(current))) {
                        flag = 0;
                        break;
                    } else {
                        history += prev;
                    }
                }
            }
            if (flag == 1) {
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}
