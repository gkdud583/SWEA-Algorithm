import java.util.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

        StringBuffer sb = new StringBuffer();

        int T = 10;

        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(sc.nextInt()).append(" ");
            
            int N = sc.nextInt();
            int M = sc.nextInt();

            sb.append(solve(0, N, M)).append("\n");
            
        }
        System.out.println(sb);
        
    }
    static int solve(int c, int N, int M){
        if(c >= M){
            return 1;
        }
        return N * solve(c+1, N, M);
    }
    
    
    
}