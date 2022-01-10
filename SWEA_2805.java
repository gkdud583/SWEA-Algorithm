import java.util.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

        StringBuffer sb = new StringBuffer();

        int T = Integer.parseInt(sc.nextLine());

        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");
            
            int N = Integer.parseInt(sc.nextLine());
            
            int map[][] = new int[N][N];
            for(int i=0; i<N; i++){
                String input[] = sc.nextLine().split("");
                for(int j=0; j<N; j++){
                    map[i][j] = Integer.parseInt(input[j]);
                }
            }

            sb.append(solve(N, map)).append("\n");
            
        }
        System.out.println(sb);
        
    }
    static int solve(int N, int map[][]){
        int i = N / 2;
        int c = 1;
        int sum = 0;
        for(int r=0; r<N; r++){
            int ii = i;
            for(int j=0; j<c; j++){
                sum += map[r][ii++];
            }
            if(r >= N/2){
                c-=2;
                i++;
            }else{
                c+=2;
                i--;
            }

        }
        return sum;
    }
    
    
    
}