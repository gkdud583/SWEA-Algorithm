import java.util.*;

import static java.lang.Math.min;

public class SWEA_10200 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();


        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc).append(" ");

            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();

            if (A + B > N) {
                sb.append(min(A, B)).append(" ");
                sb.append(A + B - N).append("\n");
                continue;
            }
            sb.append(min(A, B)).append(" ");
            sb.append(0).append("\n");
        }
        System.out.println(sb);
    }
}