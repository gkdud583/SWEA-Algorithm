import java.util.*;

public class SWEA_8741 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();


        int T = Integer.parseInt(sc.nextLine());
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc).append(" ");
            String input[] = sc.nextLine().split(" ");
            for(int i=0; i<input.length; i++){
                String firstLetter = String.valueOf(input[i].charAt(0));

                sb.append(firstLetter.toUpperCase(Locale.ROOT));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }





}