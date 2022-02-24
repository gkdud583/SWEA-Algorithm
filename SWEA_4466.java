import java.util.*;

public class SWEA_4466 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();


        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc).append(" ");

            int N = sc.nextInt();
            int K = sc.nextInt();

            Integer array[] = new Integer[N];
            for(int i=0; i<N; i++){
                array[i] = sc.nextInt();
            }
            Arrays.sort(array, Collections.reverseOrder());

            int sum = 0;
            for(int i=0; i<K; i++){
                sum += array[i];
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }

}