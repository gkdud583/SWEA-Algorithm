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

            String input[] = sc.nextLine().split(" ");
            Queue<String> queue1 = new LinkedList<>();
            Queue<String> queue2 = new LinkedList<>();

            int index = 0;
            if(N % 2 == 0){
                index = N/2;
            }else{
                index = N/2+1;
            }
            for(int i=0; i<index; i++){
                queue1.add(input[i]);
            }

            for(int i=index; i<N; i++){
                queue2.add(input[i]);
            }

            //셔플
            for(int i=0; i<N; i+=2){
                while(!queue1.isEmpty()){
                    sb.append(queue1.poll()).append(" ");
                    break;
                }
                while(!queue2.isEmpty()){
                    sb.append(queue2.poll()).append(" ");
                    break;
                }
            }
            sb.append("\n");

        }
        System.out.println(sb);
	}
}