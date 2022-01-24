import java.util.*;
class Location{
    int y;
    int x;
    Location(int y, int x){
        this.y = y;
        this.x = x;
    }
}

class Solution
{
    static int wc = 0;
    static int bc = 0;

	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();


        int T = Integer.parseInt(sc.nextLine());
        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");

            wc = 0;
            bc = 0;
            int N = sc.nextInt();
            int M = sc.nextInt();

            int map[][] = new int[N+1][N+1];


            init(map,N);

      
            for(int i=0; i<M; i++){
                int y = sc.nextInt();
                int x = sc.nextInt();
                int c = sc.nextInt();

                placeStone(map, N, y, x, c);
               
            }
            sb.append(bc).append(" ").append(wc).append("\n");
        }
        System.out.println(sb);
	}
    static void init(int map[][], int N){
        //흑돌 1, 백돌 2
        map[N/2][N/2] = 2;
        map[N/2+1][N/2+1] = 2;
        wc += 2;

        map[N/2][N/2+1] = 1;
        map[N/2+1][N/2] = 1;
        bc += 2;
    }
    static void placeStone(int map[][], int N, int y, int x, int c){
       
       
        //위, 아래, 왼쪽, 오른쪽, 위 왼쪽 대각선, 위 오른쪽 대각선, 아래 왼쪽 대각선, 아래 오른쪽 대각선
        int dy[] = {-1,1,0,0,-1,-1,1,1};
        int dx[] = {0,0,-1,1,-1,1,-1,1};
        for(int i=0; i<8; i++){
             Queue<Location> queue = new LinkedList<>();
            int ny = y + dy[i];
            int nx = x + dx[i];

            while(!isOutOfArray(ny, nx, N)){
                if(map[ny][nx] == c){
                    checkMap(queue, map, c);
                    break;
                }else if(map[ny][nx] != 0){
                    queue.add(new Location(ny,nx));
                }else{
                    break;
                }
                ny += dy[i];
                nx += dx[i];
            }
            
        }
        map[y][x] = c;
        if(c == 1){
            bc++;
        }else{
            wc++;
        }
    }
    static boolean isOutOfArray(int y, int x, int N){
        if(y <= 0 || x <= 0 || y > N || x > N)
            return true;
        return false;
    }
    
    static void checkMap(Queue<Location> queue, int map[][], int c){
        while(!queue.isEmpty()){
            Location loc = queue.poll();
            map[loc.y][loc.x] = c;
            if(c == 1){
                bc++;
                wc--;
            }else{
                bc--;
                wc++;
            }
        }
    }
}