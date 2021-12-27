
import java.util.*;




public class SWEA_1946 {
    public static void main(String[]args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();


        int T = Integer.parseInt(sc.nextLine());

        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append("\n");

            int N = Integer.parseInt(sc.nextLine());
            int cnt = 0;


            for(int i=0; i<N; i++){
                String input[] = sc.nextLine().split(" ");
                String s = input[0];
                int count = Integer.parseInt(input[1]); 
                

                for(int j=0; j<count; j++){
                    sb.append(s);
                    cnt++;
                    if(cnt % 10 == 0){
                        cnt = 0;
                        sb.append("\n");
                    }
                }
            }
            sb.append("\n");
        }
        
        System.out.println(sb);
        
    }
    
  
}