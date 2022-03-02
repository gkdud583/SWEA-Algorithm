import java.util.*;

public class SWEA_8931 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();


        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc).append(" ");

            int K = sc.nextInt();
            int sum = 0;
            Stack<Integer> stack = new Stack<>();

            for(int i=0; i<K; i++){
                int v = sc.nextInt();

                if(v == 0) {
                    sum -= stack.pop();
                } else {
                    stack.add(v);
                    sum += v;
                }

            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }


}