import java.util.*;

public class SWEA_3307 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int T = Integer.parseInt(sc.nextLine());
        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");

            int N = sc.nextInt();

            int array[] = new int[N];
            for(int i=0; i<N; i++){
                array[i] = sc.nextInt();
            }

            int dp[] = new int[N];
            int min = 0;
            int len = 0;

            for(int i=0; i<N; i++){
                if(array[i] >= min){
                    len++;
                    min = array[i];
                    dp[i] = len;
                }else {
                    int index = 0;
                    int max = 0;
                    for (int j = i - 1; j >= 0; j--) {
                        if (array[j] <= array[i]) {
                            if (max < dp[j]) {
                                max = dp[j];
                                index = j;
                            }
                        }
                    }
                    dp[i] = max + 1;
                    if(len < dp[i]){
                        len = dp[i];
                        min = array[i];
                    }
                }


            }
            sb.append(len).append("\n");

        }
        System.out.println(sb);

    }


}