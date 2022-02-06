
import java.util.*;




public class SWEA_1948 {
    public static void main(String[]args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();


        int cal[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int T = Integer.parseInt(sc.nextLine());

        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");

            int m1 = sc.nextInt();
            int d1 = sc.nextInt();

            int m2 = sc.nextInt();
            int d2 = sc.nextInt();

            int diff = cal[m1] - d1 + 1;

            for(int m=m1+1; m<m2; m++){
                diff += cal[m];
            }
            
            if(m1 != m2)
                diff += d2;
            
            sb.append(diff).append("\n");
        }
        
        System.out.println(sb);
        
    }
    
  
}