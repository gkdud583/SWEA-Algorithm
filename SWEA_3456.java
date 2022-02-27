import java.util.*;

public class SWEA_3456 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();


        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc).append(" ");

            HashMap<Integer, Integer> map = new HashMap<>();

            for(int i=0; i<3; i++){
                int n = sc.nextInt();
                if(map.containsKey(n)){
                    map.replace(n, map.get(n)+1);
                }else{
                    map.put(n, 1);
                }
            }
            int ans = 0;
            int cnt = 4;
            for (Integer integer : map.keySet()) {
                if(cnt > map.get(integer))
                {
                    ans = integer;
                    cnt = map.get(integer);
                }
            }

            sb.append(ans).append("\n");
        }
        System.out.println(sb);
    }

}