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
            
            Queue<Integer> queue = new LinkedList<>();

            for(int i=0; i<8; i++){
                queue.add(sc.nextInt());
            }

            int index = 1;
            while(true){
                int p = queue.poll();

                queue.add(p - index < 0 ? 0 : p - index);
                if(p - index <= 0){
                    break;
                }

                if(++index > 5){
                    index = 1;
                }
            }
            
            for(int i=0; i<8; i++){
                sb.append(queue.poll()).append(" ");
            }
            sb.append("\n");
            
        }
        System.out.println(sb);
        
    }
    
    
    
}