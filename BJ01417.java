import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class BJ01417 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int me = sc.nextInt();
        N--;

        ArrayList<Integer> votes = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            votes.add(sc.nextInt());
        }

        int count = 0;
        while (votes.size() > 0) {
            votes.sort(Comparator.reverseOrder());
            int curr = votes.get(0);
            if (me > curr) {
                break;
            } else {
                votes.set(0, curr-1);
                me++;
                count++;
            }
        }
        System.out.println(count);
    }
}
