import java.util.*;

public class SWEA_8338 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();


        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc).append(" ");

            int N = sc.nextInt();

            int sum = sc.nextInt();
            for(int i=1; i<N; i++){
                int v = sc.nextInt();
                if(v == 0){
                    continue;
                }
                if(sum + v > sum * v){
                    sum += v;
                }else{
                    sum *= v;
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }


}