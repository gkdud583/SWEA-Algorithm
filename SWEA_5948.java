import java.util.*;

public class SWEA_5948 {
    static final int NUM_SIZE = 7;
    static final int SIZE = 3;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");

            List<Integer> list = new ArrayList<>();
            HashSet<Integer> set = new HashSet<>();
            for(int i=0; i<NUM_SIZE; i++){
                list.add(sc.nextInt());
            }
            solve(0, 0, 0, list, set);


            List answer = new ArrayList(set);

            Collections.sort(answer, Collections.reverseOrder());
            sb.append(answer.get(4)).append("\n");
        }
        System.out.println(sb);

    }
    static void solve(int i, int sum, int size, List<Integer> list, HashSet<Integer> set){
        if(size >= SIZE){
            set.add(sum);

            return;
        }
        for(int j=i; j<NUM_SIZE; j++){
            solve(j+1, sum+list.get(j), size+1, list, set);
        }
    }

}