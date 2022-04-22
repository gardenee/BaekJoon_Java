import java.util.*;

public class BJ15312 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] ref = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            map.put(String.valueOf((char)(65+i)), ref[i]);
        }

        String myName = sc.nextLine();
        String yourName = sc.nextLine();
        int n = myName.length();

        int[] ans = new int [2 * n];
        for (int i = 0; i < n; i++) {
            ans[2 * i] = map.get(myName.substring(i, i+1));
            ans[2 * i + 1] = map.get(yourName.substring(i, i+1));
        }

        /*map.forEach((key,value) -> {
            System.out.println(key + " : " + value);
        });*/

        for (int i = 1; i <= 2 * n - 2; i++) {
            for (int j = 0; j < 2 * n - i; j++) {
                if ((ans[j] + ans[j+1]) < 10) {
                    ans[j] += ans[j+1];
                } else {
                    ans[j] = (ans[j] + ans[j+1]) % 10;
                }
            }
        }
        System.out.print(ans[0]);
        System.out.print(ans[1]);
    }
}
