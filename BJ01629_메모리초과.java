import java.util.*;

public class BJ01629_메모리초과 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();

        long[] arr = new long[(int)C];
        long result = 1;
        int fin = 0;
        for (int i = 0; i < B; i++) {
            result = mul(A, C, result);
            if (Arrays.asList(arr).contains(result)) {
                fin = i;
                break;
            } else {
                arr[i] = result;
            }
        }

        if (B <= fin) {
            System.out.println(arr[(int)B]);
        } else {
            long x = Arrays.asList(arr).indexOf(result);
            System.out.println(arr[(int)(x + ((B-x) % (fin-x)))]);
        }
    }

    public static long mul(long A, long C, long result) {
        return (result * A) % C;
    }
}
