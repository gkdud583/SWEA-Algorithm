
import java.util.*;
import java.io.*;



public class SWEA_1204 {
    public static void main(String[]args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int T = sc.nextInt();

        
        for(int tc = 1; tc<=T; tc++){
            sc.nextInt();
            sb.append("#"+tc+" ");

            int count[] = new int[101];
            int maxCount = 0, maxScore = 0;
            for(int i=0; i<1000; i++){
                int score = sc.nextInt();
                count[score]++;
                if(maxCount < count[score])
                {
                    maxCount = count[score];
                    maxScore = score;
                }else if(maxCount == count[score] && maxScore < score){
                    maxCount = count[score];
                    maxScore = score;
                }
            }
            sb.append(maxScore).append("\n");
        }
        System.out.println(sb);
    }
}