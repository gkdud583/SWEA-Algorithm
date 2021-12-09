
import java.util.*;
import java.io.*;



public class SWEA_1954 {
    public static void main(String[]args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int T = sc.nextInt();

        for(int tc=1; tc<=T; tc++){
            int N = sc.nextInt();
            int map[][] = new int[N][N];
            solve(0, 1, 1, N*2-1, 0, 0, N, map);
            sb.append("#").append(tc).append("\n");
            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    sb.append(map[r][c]).append(" ");
                }
                sb.append("\n");
            }

        }
        System.out.println(sb);
        
    }
    static void solve(int d, int num, int count, int end, int y, int x, int N, int map[][]){
        if(count > end){
            return;
        }
        int col = 0;
        int row = 0;
        if(d == 0){
            //오른쪽
            for(col = x; col<N; col++){
                if(map[y][col] != 0)
                    break;
                map[y][col] = num++;
            }
            x = col - 1;
            y++;
        }
        else if(d == 1){
            //아래
            for(row = y; row<N; row++){
                if(map[row][x] != 0)
                    break;
                map[row][x] = num++;
            }
            y = row - 1;
            x--;
        }else if(d == 2){
            //왼쪽
            for(col = x; col >=0; col--){
                if(map[y][col] != 0){
                    break;
                }
                map[y][col] = num++;
            }
            x = col + 1;
            y--;
        }
        else{
            //위
            for(row = y; row >=0; row--){
                if(map[row][x] != 0)
                    break;
                map[row][x] = num++;
            }
            y = row + 1;
            x++;
        }
        solve((d+1) % 4, num, count+1, end, y, x, N, map);
    }
}