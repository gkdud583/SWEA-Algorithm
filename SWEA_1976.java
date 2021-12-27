
import java.util.*;




public class SWEA_1976 {
    public static void main(String[]args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();


        int T = Integer.parseInt(sc.nextLine());

        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");

            int h1 = sc.nextInt();
            int m1 = sc.nextInt();
            int h2 = sc.nextInt();
            int m2 = sc.nextInt();

            int H=0, M=0;
            H = h1 + h2;
            if(H > 12){
                H -= 12;
            }
            M = m1 + m2;
            if(M >= 60){
                M -= 60;
                H += 1;
            }

            sb.append(H).append(" ").append(M).append("\n");
            
        }
        
        System.out.println(sb);
        
    }
    
  
}