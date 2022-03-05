import java.util.*;

public class SWEA_8658 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();


        int T = Integer.parseInt(sc.nextLine());
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc).append(" ");

            int min = 987654321, max = 0;
            String input[] = sc.nextLine().split(" ");

            for (int i = 0; i < 10; i++) {
                int sum = 0;
                for (int j = 0; j < input[i].length(); j++) {
                    sum += (input[i].charAt(j) - '0');
                }
                min = Math.min(min, sum);
                max = Math.max(max, sum);

            }
            sb.append(max).append(" ").append(min).append("\n");
        }
        System.out.println(sb);
    }


}