import java.util.*;

public class SWEA_8500 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();


        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc).append(" ");

            int N = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < N; i++) {
                list.add(sc.nextInt());
            }
            Collections.sort(list);

            int bc = 0;
            int seatCount = 0;
            for(int i = 0; i < N; i++) {
                int cur = list.get(i);

                // 왼쪽에 필요한 좌석 수 + 내 좌석 수
                seatCount += (cur - bc) + 1 + cur;
                bc = cur;
            }
            sb.append(seatCount).append("\n");
        }
        System.out.println(sb);
    }
}