import java.util.*;


public class SWEA_3142{
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int TC = sc.nextInt();
        for(int tc=1; tc<=TC; tc++) {
            sb.append("#").append(tc).append(" ");

            int N = sc.nextInt();
            int M = sc.nextInt();

            boolean isBreak = false;
            for(int i=0; i<=N/2; i++){
                for(int j=0; j<=N; j++){
                    if(i + j == M){
                        if(i * 2 + j == N){
                            sb.append(j).append(" ").append(i).append("\n");
                            isBreak = true;
                            break;
                        }
                    }
                }
                if(isBreak){
                    break;
                }
            }
        }
        System.out.println(sb);
    }

}