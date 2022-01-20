import java.util.*;
class Solution
{


    static int max = 0;
	public static void main(String args[]) throws Exception
	{
       
		Scanner sc = new Scanner(System.in);

        StringBuffer sb = new StringBuffer();

        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");
           
            int N = sc.nextInt();
            int L = sc.nextInt();

            //점수, 칼로리
            int ingredient[][] = new int[N][2];
            for(int i=0; i<N; i++){
                int s = sc.nextInt();
                int k = sc.nextInt();
                ingredient[i][0] = s;
                ingredient[i][1] = k;
            }
            max = 0;
            solve(0, ingredient, 0, 0, N, L);
            sb.append(max).append("\n");

        }
        System.out.println(sb);
	}
    static void solve(int i, int ingredient[][], int sumK, int sumS, int N, int L){
        if(L < sumK){
            return;
        }
        max = Math.max(max, sumS);
        if(i >= N){
            return;
        }
        solve(i+1, ingredient, sumK + ingredient[i][1], sumS + ingredient[i][0], N, L);
        solve(i+1, ingredient, sumK, sumS, N, L);
        
        
    }
    

    
}