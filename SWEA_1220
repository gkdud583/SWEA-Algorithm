import java.util.*;
class Solution
{

	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

        StringBuffer sb = new StringBuffer();

        int T = 10;

        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");

           int N = sc.nextInt();
           int map[][] = new int[N][N];

           for(int i=0; i<N; i++){
               for(int j=0; j<N; j++){
                   map[i][j] = sc.nextInt();
               }
           }
           sb.append(solve(N, map)).append("\n");
        }
        System.out.println(sb);
	}

    static int solve(int N, int map[][]){
        int count = 0;
        //1=빨, 2=파
        for(int i=0; i<N; i++){ //열
            for(int j=0; j<N; j++) //행
            {
                if(map[j][i] == 0 || map[j][i] == 2){
                    continue;
                }
                for(int k=j+1; k<N; k++){ //행 아래를 보는것
                    j = k;
                    if(map[k][i] == 2){
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }
}