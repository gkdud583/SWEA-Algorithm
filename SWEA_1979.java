
import java.util.*;
import java.io.*;



public class SWEA_1979 {
    public static void main(String[]args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();


        int T = sc.nextInt();


        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");

            int N = sc.nextInt();
            int K = sc.nextInt();

            int map[][] = new int[N][N];

            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    map[i][j] = sc.nextInt();
                }
            }

            int cnt = 0;
            cnt += findRowEmpty(N, K, map);
            cnt += findColEmpty(N, K, map);

            sb.append(cnt).append("\n");
        }
        
        System.out.println(sb);
        


    }
    static int findRowEmpty(int N, int K, int map[][]){
        int ret = 0;
        for(int r=0; r<N; r++){
            for(int c=0; c<N; c++){
                if(map[r][c] == 1){
                    int e = c + 1;
                    for(; e<N; e++){
                        if(map[r][e] == 0){
                            break;
                        }
                    }
                    int len = e - c;
                    if(len == K){
                        ret++;
                    }
                    c = e;
                }
            }
        }
        return ret;
    }
    
    static int findColEmpty(int N, int K, int map[][]){
        int ret = 0;
        for(int c=0; c<N; c++){
            for(int r=0; r<N; r++){
                if(map[r][c] == 1){
                    int e = r + 1;
                    for(; e<N; e++){
                        if(map[e][c] == 0){
                            break;
                        }
                    }
                    int len = e - r;
                    if(len == K){
                        ret++;
                    }
                    r = e;

                }
            }
        }
        return ret;
    }
    
}