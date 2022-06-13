import java.util.Scanner;
import java.util.Stack;

public class BJ16173 {

    public static int[] curr = {0, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] map = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        boolean[][] visited = new boolean[N][N];

        boolean flag = true;
        int[] temp;
        Stack<int[]>  stack = new Stack<>();
        stack.add(curr);

        do {
            visited[x()][y()] = true;
            int val = map[x()][y()];

            if (x()+val < N && !visited[x()+val][y()]) {
                temp = new int[]{x() + val, y()};
                stack.add(temp);
                if (x()+val == N-1 && y() == N-1) flag = false;
            }
            if (y()+val < N && !visited[x()][y()+val]) {
                temp = new int[]{x(), y() + val};
                stack.add(temp);
                if (x() == N-1 && y()+val == N-1) flag = false;
            }
            if (stack.isEmpty()) break;
            do {
                temp = stack.pop();
            } while (!stack.isEmpty() && visited[temp[0]][temp[1]]);
            curr = temp;

        } while (!visited[x()][y()] || flag);

        if (!flag) System.out.println("HaruHaru");
        else System.out.println("Hing");
    }

    public static int x() {
        return curr[0];
    }

    public static int y() {
        return curr[1];
    }
}
