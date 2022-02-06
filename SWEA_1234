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

            String input[] = sc.nextLine().split(" ");
            String str = input[1];

            sb.append(findPassword(str)).append("\n");
      
        }
        System.out.println(sb);
	}
    static String findPassword(String str){
        Queue<Integer> result = null;
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();

        boolean check = true;
        int order = 0;

        for(int i=0; i<str.length(); i++){
            queue1.add(str.charAt(i)-'0');
        }
        while(check){
           if(order == 0){
               order = 1;
               check = findPair(queue1, queue2);
               result = queue2;
           }else{
               order = 0;
               check = findPair(queue2, queue1);
               result = queue1;
           }
        }
        StringBuffer sb = new StringBuffer();
        while(!result.isEmpty()){
            sb.append(result.poll());
        }
        return sb.toString();
    }
    static boolean findPair(Queue<Integer> queue, Queue<Integer> temp){
        boolean ret = false;
        while(!queue.isEmpty()){
            int p = queue.poll();
            //마지막 남은 숫자였음.
            if(queue.size() == 0){
                temp.add(p);
                continue;
            }
            int cmp = queue.peek();
            if(p == cmp){
                ret = true;
                queue.poll();
            }else{
                temp.add(p);
            }
        }
        return ret;
    }
}