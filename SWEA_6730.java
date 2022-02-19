import java.util.*;

public class SWEA_6730 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");

            ArrayList<Integer> block = new ArrayList<>();
            int N = sc.nextInt();
            for(int i=0; i<N; i++){
                block.add(sc.nextInt());
            }

            int upLevel = 0, downLevel = 0;
            for(int i=1; i<N; i++){
                int cur = block.get(i-1);
                int nxt = block.get(i);

                if(nxt > cur){
                    //올라가기
                    upLevel = Math.max(upLevel, nxt - cur);
                }else{
                    //내려가기
                    downLevel = Math.max(downLevel, cur - nxt);
                }
            }
            sb.append(upLevel).append(" ").append(downLevel).append("\n");



        }
        System.out.println(sb);

    }

}