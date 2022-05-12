import java.util.Scanner;

public class BJ02520 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            sc.nextLine();
            int ans = 100000001;

            String[] dough = sc.nextLine().split(" ");
            double[] doughRecipe = {8, 8, 4, 1, 9};
            for (int j = 0; j < 5; j++) {
                int temp = (int) Math.floor(Integer.parseInt(dough[j]) / doughRecipe[j] * 16);
                ans = Math.min(ans, temp);
            }

            int toppings = 0;
            String[] topping = sc.nextLine().split(" ");
            int[] toppingRecipe = {1, 30, 25, 10};
            for (int j = 0; j < 4; j++) {
                int temp = Integer.parseInt(topping[j]) / toppingRecipe[j];
                toppings += temp;
            }

            System.out.println(Math.min(ans, toppings));
        }
    }
}
