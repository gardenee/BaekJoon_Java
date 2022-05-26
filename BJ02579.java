import java.util.*;

public class BJ02579 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N+1][2]; // 계단
        for (int i = 1; i < N+1; i++) {
            arr[i][0] = sc.nextInt(); // 직전에 한칸만 올라간 경우
            arr[i][1] = arr[i][0]; // 직전에 두칸 올라간 경우
        }

        if (N==1) { // 계단 한칸이면
            System.out.println(arr[1][0]);
        } else if (N==2) { // 계단 두칸이면 둘 다 밟아야 함
            System.out.println(arr[1][0]+arr[2][0]);
        } else {
            for (int i = 2; i < N+1; i++) {
                arr[i][0] += arr[i-1][1]; // 한 칸 올라왔으면
                arr[i][1] += Math.max(arr[i-2][0], arr[i-2][1]); // 두칸 올라왔으면
            }
            System.out.println(Math.max(arr[N][0], arr[N][1])); // 마지막 칸은 꼭 밟아야 함
        }
    }
}
