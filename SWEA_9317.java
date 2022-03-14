import java.util.*;

public class SWEA_9317 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();


        int T = Integer.parseInt(sc.nextLine());
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc).append(" ");

            int N = Integer.parseInt(sc.nextLine());

            String ans = sc.nextLine();
            String input = sc.nextLine();

            int correctCount = 0;
            for(int i=0; i<N; i++){
                if(ans.charAt(i) == input.charAt(i))
                    correctCount++;
            }
            sb.append(correctCount).append("\n");
        }
        System.out.println(sb);
    }


}