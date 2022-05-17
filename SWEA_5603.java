import java.util.*;

public class SWEA_5603 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();


        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc).append(" ");

            int N = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            int sum = 0;

            for(int i = 0; i < N; i++) {
                int num = sc.nextInt();
                sum += num;
                list.add(num);
            }

            Collections.sort(list);
            int avg = sum /= N;
            int ans = 0;
            for(int i = 0; i < N; i++) {
                if (list.get(i) < avg) {
                    ans += (avg - list.get(i));
                } else {
                    break;
                }
            }
            sb.append(ans).append("\n");
        }
        System.out.println(sb);
    }
}