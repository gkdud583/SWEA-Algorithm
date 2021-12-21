
import java.util.*;




public class SWEA_1945 {
    public static void main(String[]args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();


        int num[] = {2, 3, 5, 7, 11};
        int T = sc.nextInt();

        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");


            int N = sc.nextInt();
            for(int i=0; i<num.length; i++){
                int j = num[i];
                int count = 0;
                while(N % j == 0){
                    count++;
                    N /= j;
                }
                sb.append(count).append(" ");
            }
            sb.append("\n");

            
        }
        
        System.out.println(sb);
        


    }
  
    
    
}