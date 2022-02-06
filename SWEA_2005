
import java.util.*;
import java.io.*;



public class SWEA_2005 {
    public static void main(String[]args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int T = sc.nextInt();


        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append("\n");

            int N = sc.nextInt();
            
            int map[][] = new int[N+1][N+1];

            for(int i=1; i<=N; i++){
                for(int j=1; j<=i; j++){
                    if(i-1 < 1 || j-1 < 1)
                        map[i][j] = 1;
                    else    
                        map[i][j] = map[i-1][j-1] + map[i-1][j];
                }
            }

            for(int i=1; i<=N; i++){
                for(int j=1; j<=i; j++)
                    sb.append(map[i][j]).append(" ");
            
                sb.append("\n");
            }

            
            
        }
        System.out.println(sb);
        


    }
    
}