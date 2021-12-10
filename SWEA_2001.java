
import java.util.*;
import java.io.*;



public class SWEA_2001 {
    public static void main(String[]args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int T = sc.nextInt();

        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");

            int N = sc.nextInt();
            int M = sc.nextInt();
            int map[][] = new int[N][N];
            
            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    map[r][c] = sc.nextInt();
                }
            }
            sb.append(solve(N,M,map)).append("\n");
        }
        System.out.println(sb);
        
    }
    static int solve(int N, int M, int map[][]){
        int max = 0;
        for(int r=0; r<N; r++){
            for(int c=0; c<N; c++){
                max = Math.max(max, check(r,c,N,M,map));
            }
        }
        return max;
    }
    static int check(int y, int x, int N, int M, int map[][]){
        int sum = 0;
        for(int r=y; r<y+M; r++){
            for(int c=x; c<x+M; c++){
                if(r < 0 || c < 0 || r >= N || c >= N)
                    return 0;
                sum += map[r][c];
            }
        }
        return sum;
    }
}