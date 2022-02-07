import java.util.*;

public class SWEA_9229 {
    static int snak[];
    static int max = 0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");
            int N = sc.nextInt();
            int K = sc.nextInt();

            snak = new int[N];

            for(int i=0; i<N; i++){
                snak[i] = sc.nextInt();
            }
            max = 0;
            solve(0,0,0,N,K);
            if(max == 0)
                sb.append("-1").append("\n");
            else
                sb.append(max).append("\n");

        }
        System.out.println(sb);
    }

    private static void solve(int i, int size, int sum, int N, int K) {
       if(size == 2){
           max = Math.max(max, sum);
           return;
       }
        for(int j=i; j<N; j++){
           if(sum + snak[j] > K)
               continue;
           solve(j+1, size+1, sum+snak[j], N, K);
       }
    }


}
