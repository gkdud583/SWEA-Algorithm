
import java.util.*;




public class SWEA_1959 {
    public static void main(String[]args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();


        int T = sc.nextInt();

        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");


            int N = sc.nextInt();
            int M = sc.nextInt();

            ArrayList<Integer> A = new ArrayList<>();
            ArrayList<Integer> B = new ArrayList<>();

            for(int i=0; i<N; i++){
                A.add(sc.nextInt());
            }
            
            for(int i=0; i<M; i++){
                B.add(sc.nextInt());
            }

            if(N > M){
                sb.append(solve(N,M,A,B));
            }else{
                sb.append(solve(M,N,B,A));

            }
            sb.append("\n");

            
        }
        
        System.out.println(sb);
        
    }
    static int solve(int maxN, int minN, ArrayList<Integer> maxList, ArrayList<Integer> minList){
        int max = 0;

        int str = 0;
        int end = str + minN;
        
        while(end <= maxN){
            int sum = 0;
            for(int i=str, j=0; i<end; i++){
                sum += maxList.get(i) * minList.get(j);
                j++; 
            }
            max = Math.max(max, sum);
            str++;
            end = str + minN;
        }
        return max;
    }
  
}