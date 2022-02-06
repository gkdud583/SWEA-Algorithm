
import java.util.*;




public class SWEA_1285 {
    public static void main(String[]args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();


        int T = Integer.parseInt(sc.nextLine());

        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");

            int N = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();

            int ans = 100001;
            for(int i=0; i<N; i++){
                int loc = sc.nextInt();
                int dist = Math.max(loc, 0) - Math.min(loc, 0);
                list.add(dist);
                ans = Math.min(ans, dist);

            }

            int cnt = 0;
            for(int dist : list){
                if(dist == ans){
                    cnt++;
                }
            }
            sb.append(ans).append(" ").append(cnt).append("\n");
        }
        
        System.out.println(sb);
        
    }
    
  
}