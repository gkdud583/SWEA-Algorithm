import java.util.*;


class Solution
{

	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");
            HashMap<Integer, Integer> map = new HashMap<>();
            int N = sc.nextInt();

            for(int i=0; i<N; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();

                for(int j=a; j<=b; j++){
                    if(map.containsKey(j)){
                        int cnt = map.get(j);
                        map.replace(j, cnt+1);
                    }else{
                        map.put(j, 1);
                    }
                }
            }
            int P = sc.nextInt();
            for(int i=0; i<P; i++){
                int C = sc.nextInt();
                if(!map.containsKey(C))
                    sb.append(0).append(" ");
                else
                    sb.append(map.get(C)).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
	}
}