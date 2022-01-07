import java.util.*;
class Solution
{
     static final int SIZE = 100;
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

        StringBuffer sb = new StringBuffer();

        int T = 10;

        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(sc.nextInt()).append(" ");
            int map[][] = new int[SIZE][SIZE];
            for(int i=0; i<SIZE; i++){ //행
                for(int j=0; j<SIZE; j++){ //열
                    map[i][j] = sc.nextInt();
                }
            }
            sb.append(solve(map)).append("\n");

            
            

           
        }
        System.out.println(sb);
	}
    static int solve(int map[][]){
        int max = 0;
        //각 행의 합
        for(int i=0; i<SIZE; i++){
            int sum = 0;
            for(int j=0; j<SIZE; j++){
                sum += map[i][j];
            }
            max = Math.max(max, sum);
        }

        //각 열의 합
        for(int i=0; i<SIZE; i++){
            int sum = 0;
            for(int j=0; j<SIZE; j++){
                sum += map[j][i];
            }
            max = Math.max(max, sum);
        }

        //왼쪽 대각선
        int i=0;
        int j=0;
        int sum = 0;
        while(i < SIZE && j < SIZE){
            sum += map[i][j];
            i++;
            j++;
        }
        max = Math.max(max, sum);

        //오른쪽 대각선
        i=0;
        j=SIZE-1;
        sum = 0;
        while(i < SIZE && j >= 0){
            sum += map[i][j];
            i++;
            j--;
        }
        max = Math.max(max, sum);

        return max;
    }
}