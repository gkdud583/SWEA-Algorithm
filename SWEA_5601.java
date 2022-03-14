import java.util.*;

public class SWEA_5601 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();


        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc).append(" ");

            int N = sc.nextInt();

            for(int i=0; i<N; i++){
                sb.append("1/").append(N).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }


}