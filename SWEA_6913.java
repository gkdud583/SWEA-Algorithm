import java.util.*;

public class SWEA_6913 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");

            int N = sc.nextInt();
            int M = sc.nextInt();

            int scores[] = new int[N];
            int firstScore = 0;
            for(int i=0; i<N; i++){
                int score = 0;
                for(int j=0; j<M; j++) {
                    score += sc.nextInt();
                }
                firstScore = Math.max(firstScore, score);
                scores[i] = score;
            }

            int count = 0;
            for(int i=0; i<N; i++){
                if(firstScore == scores[i]){
                    count++;
                }
            }
            sb.append(count).append(" ").append(firstScore).append("\n");
        }
        System.out.println(sb);

    }

}