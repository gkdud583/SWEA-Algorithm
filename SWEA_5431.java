import java.util.*;

public class SWEA_5431 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");

            int N = sc.nextInt();
            boolean student[] = new boolean[N+1];

            int K = sc.nextInt();
            for(int i=0; i<K; i++){
                student[sc.nextInt()] = true;
            }

            for(int i=1; i<=N; i++){
                if(!student[i])
                    sb.append(i).append(" ");
            }
            sb.append("\n");

        }
        System.out.println(sb);

    }

}