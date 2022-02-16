import java.util.*;

public class SWEA_6808 {
    static int compareCard[] = new int[10];
    static int card[] = new int[10];
    static int loseCnt = 0;
    static int winCnt = 0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");
            HashSet<Integer> set = new HashSet<>();

            for(int i=1; i<=9; i++){
                compareCard[i] = sc.nextInt();
                set.add(compareCard[i]);
            }

            for(int i=1, j=1; i<=18; i++){
                if(!set.contains(i)){
                    card[j++] = i;
                }
            }
            loseCnt = 0;
            winCnt = 0;
            solve(1, 0, 0, new boolean[19]);
            sb.append(loseCnt).append(" ").append(winCnt).append("\n");


        }
        System.out.println(sb);

    }

    static void solve(int i, int compareScore, int score, boolean check[]){
        if(i > 9){
            if(compareScore > score){
                loseCnt++;
            }else if(compareScore < score){
                winCnt++;
            }
            return;
        }
        for(int j=1; j<=9; j++){
            if(!check[card[j]]){
                check[card[j]] = true;
                if(compareCard[i] > card[j]){
                    solve(i+1, compareScore + compareCard[i] + card[j], score, check);
                }else if(compareCard[i] < card[j]){
                    solve(i+1, compareScore, score + compareCard[i] + card[j], check);
                }else{
                    solve(i+1, compareScore, score, check);
                }
                check[card[j]] = false;
            }
        }
    }


}