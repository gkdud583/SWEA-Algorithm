import java.util.*;

public class SWEA_6900 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();


        int T = Integer.parseInt(sc.nextLine());
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc).append(" ");

            String input[] = sc.nextLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);

            String winningInfo[][] = new String[N][2];

            for (int i = 0; i < N; i++) {
                input = sc.nextLine().split(" ");
                winningInfo[i][0] = input[0];
                winningInfo[i][1] = input[1];
            }

            int sum = 0;
            for (int i = 0; i < M; i++) {
                String v = sc.nextLine();

                boolean isCorrect = true;
                for (int j = 0; j < N; j++) {
                    isCorrect = true;
                    String com = winningInfo[j][0];
                    for (int k = 0; k < com.length(); k++) {
                        char c = com.charAt(k);
                        if (c == '*') {
                            continue;
                        }
                        if (c != v.charAt(k)) {
                            isCorrect = false;
                            break;
                        }
                    }
                    if (isCorrect) {
                        sum += Integer.parseInt(winningInfo[j][1]);
                        break;
                    }
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}