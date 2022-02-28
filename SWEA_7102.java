import java.util.*;

public class SWEA_7102 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();


        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc).append(" ");

            int N = sc.nextInt();
            int M = sc.nextInt();

            ArrayList<Integer> cardSet1 = new ArrayList<>();
            ArrayList<Integer> cardSet2 = new ArrayList<>();

            for(int i=1; i<=N; i++){
                cardSet1.add(i);
            }
            for(int i=1; i<=M; i++){
                cardSet2.add(i);
            }

            HashMap<Integer, Integer> map = new HashMap<>();

            int max = 0;
            for(int i=1; i<=N; i++){
                int sum = i;
                for(int j=1; j<=M; j++){
                    int copySum = sum + j;
                    int com = 0;
                    if(map.containsKey(copySum)){
                        com = map.get(copySum) + 1;
                        map.replace(copySum, com);
                    }else{
                        com = 1;
                        map.put(copySum, com);
                    }
                    max = Math.max(max, com);
                }
            }
            List<Map.Entry<Integer, Integer>> entries = new LinkedList<>(map.entrySet());
            Collections.sort(entries, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

            ArrayList<Integer> answer = new ArrayList<>();

            for(int i=0; i<entries.size(); i++){
                if(entries.get(i).getValue() == max){
                    answer.add(entries.get(i).getKey());
                }else
                    break;
            }
            Collections.sort(answer);
            for(int i=0; i<answer.size(); i++){
                sb.append(answer.get(i)).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }


}