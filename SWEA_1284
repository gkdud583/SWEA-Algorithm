
import java.util.*;
import java.io.*;



public class SWEA_1284 {
    public static void main(String[]args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int T = sc.nextInt();

        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");

            int P = sc.nextInt();
            int Q = sc.nextInt();
            int R = sc.nextInt();
            int S = sc.nextInt();
            int W = sc.nextInt();

            int A = P * W;
            int B = Q;
            if(W > R){
                B += S * (W-R);
            }

            sb.append(Math.min(A,B)).append("\n");
            
        }
        System.out.println(sb);
        
        


    }
    
}