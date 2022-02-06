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

            HashMap<Integer, Integer> spaceMap = new HashMap<>(); // 주차 공간마다 따로 책정된 단위 무게당 금액 
            HashMap<Integer, Integer> carMap = new HashMap<>(); // 차량의 무게
            int parkingArr[] = new int[M+1]; // 자동차가 주차한 주차 공간 번호
            int totalProfit = 0;
            for(int i=0; i<N; i++){
                spaceMap.put(i+1, sc.nextInt());
            }
            for(int i=0; i<M; i++){
                carMap.put(i+1, sc.nextInt());
            }
            
            Queue<Integer> waitQueue = new LinkedList<>(); // 주차 공간이 없을 때, 차량이 대기하는 큐
            PriorityQueue<Integer> emptyQueue = new PriorityQueue<>(); // 빈 주차 공간을 가지고 있는 큐

            for(int i=1; i<=N; i++){
                emptyQueue.add(i);
            }
            for(int i=0; i<2*M; i++){
                int n = sc.nextInt();
                if(n > 0){
                    //출입
                    if(emptyQueue.isEmpty()){
                        //빈 공간이 없음.
                        waitQueue.add(n);
                    }else{
                        int parkingIndex = emptyQueue.poll();
                        parkingArr[n] = parkingIndex;
                    }
                }else{
                    //퇴장
                    int carIndex = n * -1;
                    int parkingIndex = parkingArr[carIndex];
                    totalProfit += carMap.get(carIndex) * spaceMap.get(parkingIndex);
                    emptyQueue.add(parkingIndex);
                    
                    //대기큐에 있는 차량 출입
                    if(!waitQueue.isEmpty()){
                        parkingIndex = emptyQueue.poll();
                        carIndex = waitQueue.poll();
                        parkingArr[carIndex] = parkingIndex;
                    }

                }
            }
            sb.append(totalProfit).append("\n");
        }
        System.out.println(sb);
	}
    
}