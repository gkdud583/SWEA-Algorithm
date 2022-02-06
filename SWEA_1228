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
           
            List<Integer> list = new LinkedList<>();
            
            int N = Integer.parseInt(sc.nextLine());
            String input[] = sc.nextLine().split(" ");
            for(int i=0; i<N; i++){
                list.add(Integer.parseInt(input[i]));
            }
            int M = Integer.parseInt(sc.nextLine());
            input = sc.nextLine().split(" ");

            int index = 0;
            for(int i=0; i<M; i++){
                ++index;
                int X = Integer.parseInt(input[index++]);
                int Y = Integer.parseInt(input[index++]);
                int max = index + Y;
                for(; index<max; index++){
                    list.add(X++, Integer.parseInt(input[index]));
                }

            }
            for(int i=0; i<10; i++){
                sb.append(list.get(i)).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
	}

    
}