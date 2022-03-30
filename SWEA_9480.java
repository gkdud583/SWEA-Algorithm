import java.util.*;


public class SWEA_9480{
    private static int count = 0;
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int TC = Integer.parseInt(sc.nextLine());
        for(int tc=1; tc<=TC; tc++) {
            sb.append("#").append(tc).append(" ");

            count = 0;

            int N = Integer.parseInt(sc.nextLine());

            List<String> list = new ArrayList<>();
            boolean alphabet[][] = new boolean[N][26];

            for(int i=0; i<N; i++){
                String word = sc.nextLine();
                list.add(word);
                for(char j='a'; j<='z'; j++){
                    if(word.contains(String.valueOf(j))) {
                        alphabet[i][j-'a'] = true;
                    }
                }
            }

            for(int i=1; i<=N; i++){
                solve(0, 0, i, N, alphabet, new boolean[N]);
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
    private static void solve(int i, int size, int max, int N, boolean alphabet[][], boolean check[]){
        if(size >= max){
            if(isPossible(N, alphabet, check))
                count++;
            return;
        }
        if(i >= N){
            return;
        }
        check[i] = true;
        solve(i+1, size+1, max, N, alphabet, check);
        check[i] = false;
        solve(i+1, size, max, N, alphabet, check);

    }
    private static boolean isPossible(int N, boolean alphabet[][], boolean check[]){
        for(char a = 'a'; a <= 'z'; a++){ // 해당 알파벳을 포함하는
            boolean isContains =  false;
            for(int i=0; i<N; i++){ // 단어를 포함했는지 확인
                if(alphabet[i][a-'a'] && check[i]){
                    isContains = true;
                    break;
                }
            }
            if(!isContains){
                return false;
            }
        }
        return true;
    }

}