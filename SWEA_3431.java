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

            int L = sc.nextInt();
            int U = sc.nextInt();
            int X = sc.nextInt();

            if(X < L)sb.append(L-X);
            else if(X < U)sb.append(0);
            else sb.append(-1);

            sb.append("\n");
      
        }
        System.out.println(sb);
	}
}