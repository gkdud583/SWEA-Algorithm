import java.util.*;


public class SWEA_3282 {
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int TC = sc.nextInt();
        for(int tc=1; tc<=TC; tc++) {
            sb.append("#").append(tc).append(" ");

            int N = sc.nextInt();
            int K = sc.nextInt();

            int w[] = new int[N+1];
            int cost[] = new int[N+1];

            for(int i=1; i<=N; i++){
                w[i] = sc.nextInt();
                cost[i] = sc.nextInt();
            }

            int dp[][] = new int[N+1][K+1];
            for(int i=1; i<=N; i++){
                for(int j=1; j<=K; j++){
                    if(w[i] > j){
                        dp[i][j] = dp[i-1][j];
                    }else{
                        dp[i][j] = Math.max(dp[i - 1][j - w[i]] + cost[i],
                                dp[i - 1][j]);
                    }
                }
            }
            sb.append(dp[N][K]).append("\n");

        }
        System.out.println(sb);
    }

}