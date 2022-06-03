import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BJ16943 {

    public static String ans = "";
    public static boolean flag = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        char[] A = String.valueOf(a).toCharArray();
        char[] B = String.valueOf(b).toCharArray();
        Arrays.sort(A);

        if (A.length < B.length) {
            for (int i = A.length-1; i >= 0; i--) {
                ans += A[i];
            }
        } else if (A.length == B.length) {
            String temp = "";
            int i = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[j] != '0') {
                    i = j;
                    temp += A[i];
                    break;
                }
            }
            for (int j = 0; j < A.length; j++) {
                if (j != i) temp += A[j];
            }
            if (Integer.parseInt(temp) >= b) ans = "-1";
            else {
                search(A, b, new ArrayList<Integer>());
            }
        } else ans = "-1";

        System.out.println(ans);
    }

    public static void search(char[] A, int b, ArrayList<Integer> curr) {
        if (flag) return;
        if (curr.size() == A.length) {
            String temp = "";
            for (Integer i: curr) {
                temp += A[i];
            }
            if (Integer.parseInt(temp) < b) {
                ans = temp;
                flag = true;
            }
        }
        for (int i = A.length-1; i >= 0; i--) {
            if (flag) return;
            if (!curr.contains(i)) {
                curr.add(i);
                search(A, b, curr);
                curr.remove(curr.size()-1);
            }
        }
    }
}
