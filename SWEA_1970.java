
import java.util.*;




public class SWEA_1970 {
    public static void main(String[]args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int money[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        int T = sc.nextInt();

        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append("\n");


            int N = sc.nextInt();

            int count[] = new int[money.length];
            int i = 0;
            while(N > 0 && i<money.length){
                while(i<money.length){
                    if(money[i] <= N){
                        count[i] = N / money[i];
                        N = N % money[i];
                    }else   
                        break;
                }
                i++;
            }
            for(int j=0; j<count.length; j++){
                sb.append(count[j]).append(" ");
            }
            sb.append("\n");
        }
        
        System.out.println(sb);
        


    }
  
    
    
}