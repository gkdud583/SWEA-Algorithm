import java.util.*;

public class SWEA_8104 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();


        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc).append(" ");

            int N = sc.nextInt();
            int K = sc.nextInt();

            int sum = 0;
            for(int i=1; i<=N; i++){

                if(i % 2 == 0){
                    //짝수
                    sum += (i * K);
                }else{
                    //홀수
                    sum += ((i-1) * K) + 1;
                }
            }
            for(int i=0; i<N; i++){
                if(K % 2 == 0){
                    sb.append(sum).append(" ");
                }else{
                    sb.append(sum + i).append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

}