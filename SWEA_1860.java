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
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();

            PriorityQueue<Integer> queue = new PriorityQueue<>();
            for(int i=0; i<N; i++){
                queue.add(sc.nextInt());
            }

            int cnt = 0; //현재 가지고 있는 붕어빵 갯수
            int beforeTime = 0; //이전에 붕어빵 나온 시간
            boolean isPossible = true; //구매 가능한지 확인
            while(!queue.isEmpty()){
                int enterTime = queue.poll(); //손님 도착 시간
                int newCnt = (enterTime - beforeTime) / M * K; //남은 시간동안 만들수 있는 붕어빵 갯수
                cnt += newCnt;
                beforeTime = beforeTime + (newCnt / K * M);
                if(cnt == 0){
                    isPossible = false;
                    break;
                }
                cnt -= 1;

            }
            if(isPossible)
                sb.append("Possible").append("\n");
            else
                sb.append("Impossible").append("\n");

        }
        System.out.println(sb);
    }
}