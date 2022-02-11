import java.util.*;

public class SWEA_5356 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int T = Integer.parseInt(sc.nextLine());
        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");

            int len = 0;
            String arr[][] = new String[5][15];
            for(int i=0; i<5; i++){
                String input[] = sc.nextLine().split("");
                len = Math.max(len, input.length);
                for(int j=0; j<input.length; j++){
                    arr[i][j] = input[j];
                }
            }

            for(int i=0; i<len; i++){
                StringBuffer word = new StringBuffer();
                for(int j=0; j<5; j++){
                    if(arr[j][i] != null){
                        word.append(arr[j][i]);
                    }
                }
                sb.append(word);
            }
            sb.append("\n");

        }
        System.out.println(sb);

    }


}