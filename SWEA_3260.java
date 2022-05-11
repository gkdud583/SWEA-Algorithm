import java.util.*;

public class SWEA_3260 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();


        int T = Integer.parseInt(sc.nextLine());
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc).append(" ");

            String input[] = sc.nextLine().split(" ");
            String n1 = input[0];
            String n2 = input[1];

            String maxString;
            String minString;
            int maxLen = 0;
            int minLen = 0;

            if (n1.length() > n2.length()) {
                maxLen = n1.length();
                maxString = n1;
                minLen = n2.length();
                minString = n2;
            } else {
                maxLen = n2.length();
                maxString = n2;
                minLen = n1.length();
                minString = n1;
            }

            StringBuffer result = new StringBuffer();
            int bef = 0;

            for(int i = maxLen-1, j = minLen-1; i >= 0; i--, j--) {
                int sum = maxString.charAt(i) - '0' + bef;
                if (j >= 0) {
                    sum += minString.charAt(j) - '0';
                }
                bef = sum / 10;
                result.insert(0, sum % 10);
            }
            result.insert(0, bef);
            if (result.toString().charAt(0) == '0') {
                sb.append(result.substring(1)).append("\n");
            } else {
                sb.append(result).append("\n");
            }
        }
        System.out.println(sb);
    }
}