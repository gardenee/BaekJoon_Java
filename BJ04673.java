public class BJ04673 {
    public static int d(int n) {
        return (n/10000 + (n%10000)/1000 + ((n%10000)%1000)/100 + (((n%10000)%1000)%100)/10 + (((n%10000)%1000)%100)%10 + n);
    }

    public static void main(String[] args) {
        int[] arr = new int[10001];
        arr[0] = 1;
        for (int i = 1; i < 10001; i++) {
            int temp = d(i);
            if (temp < 10001) {
                arr[temp] = 1;
            }
        }

        for (int i = 1; i < 10001; i++) {
            if (arr[i] != 1) {
                System.out.println(i);
            }
        }
    }
}
