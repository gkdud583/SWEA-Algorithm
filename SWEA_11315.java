import java.util.*;

public class SWEA_11315 {
    //아래 오른쪽 왼쪽아래대각선, 오른쪽아래대각선
    static final int DIRECTION_Y[] = {1,0,1,1};
    static final int DIRECTION_X[] = {0,1,-1,1};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();


        int T = Integer.parseInt(sc.nextLine());

        for (int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc).append(" ");

            int N = Integer.parseInt(sc.nextLine());
            char map[][] = new char[N][N];

            for(int i=0; i<N; i++){
                String input[] = sc.nextLine().split("");
                for(int j=0; j<N; j++){
                    map[i][j] = input[j].charAt(0);
                }
            }
            sb.append(solve(N, map)).append("\n");
        }
        System.out.println(sb);
    }
    static String solve(int N, char map[][]){
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                //아래, 오른쪽, 아래왼쪽대각선, 아래오른쪽대각선을 확인함
                if(map[i][j] == 'o'){
                    for(int k=0; k<4; k++){
                        boolean result = check(k, i, j, N, map);
                        if(result){
                            return "YES";
                        }
                    }
                }

            }
        }
        return "NO";
    }

    static boolean check(int direction, int y, int x, int N, char map[][]){
        for(int i=1; i<5; i++){
            y += DIRECTION_Y[direction];
            x += DIRECTION_X[direction];

            if(y < 0 || x < 0 || y >= N || x >= N)
                return false;
            if(map[y][x] != 'o'){
                return false;
            }
        }
        return true;
    }



}