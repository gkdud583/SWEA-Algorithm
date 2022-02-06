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
            int M = sc.nextInt();

            ArrayList<Integer> edges[] = new ArrayList[N+1];
            for(int i=1; i<=N; i++){
                edges[i] = new ArrayList<>();
            }

            for(int i=0; i<M; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                edges[a].add(b);
                edges[b].add(a);
            }
            max = 0;
            for(int i=1; i<=N; i++){
                boolean check[] = new boolean[N+1];
                check[i] = true;
                int cmp = solve(edges,check,i) + 1;
                max = Math.max(max,cmp);
            }
            sb.append(max).append("\n");

        }
        System.out.println(sb);
	}
    static int solve(ArrayList<Integer> edges[], boolean check[], int cur){
        int count = 0;
        int ret = 0;
        for(int i=0; i<edges[cur].size(); i++){
            int nxt = edges[cur].get(i);
            if(check[nxt])
                continue;
            check[nxt] = true;
            count += solve(edges, check, nxt) + 1;
            ret = Math.max(ret,count);
            check[nxt] = false;
            
            count = 0;
            
        }
        return ret;

    }

    
}