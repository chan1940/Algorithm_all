import java.util.Scanner;

public class inflearn_p1 {

    public void solution(int n, int[][] arr) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            int h = arr[i][0];
            int w = arr[i][1];

            boolean player = true;
            for (int j = 0; j < n; j++) {
                if (h < arr[j][0] && w < arr[j][1]) {
                    player = false;
                    break;
                }
            }
            if (player == true) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        inflearn_p1 T = new inflearn_p1();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        T.solution(n, arr);

    }
}
