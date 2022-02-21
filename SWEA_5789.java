import java.util.*;

public class SWEA_5789 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");

            int N = sc.nextInt();
            int Q = sc.nextInt();

            int num[] = new int[N+1];
            for(int i=1; i<=Q; i++){
                int L = sc.nextInt();
                int R = sc.nextInt();

                for(int j=L; j<=R; j++){
                    num[j] = i;
                }
            }
            for(int i=1; i<=N; i++){
                sb.append(num[i]).append(" ");
            }
            sb.append("\n");

        }
        System.out.println(sb);

    }

}