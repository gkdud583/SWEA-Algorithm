import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class SWEA_7510 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int T = sc.nextInt();

        StringBuffer sb = new StringBuffer();

        for (int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc).append(" ");

            int N = sc.nextInt();
            long count = 0;

            long sum[] = new long[N + 1];
            for (int i = 1; i <= N; i++) {
                sum[i] = sum[i - 1] + i;
            }
            for (int i = 1; i <= N; i++) {
                if (sum[i] == N)
                    count++;
                if(sum[i] < N)
                    continue;
                for (int j = i - 1; j >= 1; j--) {
                    if(sum[i] - sum[j] > N)
                        break;
                    if (sum[i] - sum[j] == N)
                        count++;
                }
            }

            sb.append(count).append("\n");

        }
        System.out.println(sb);

    }
}