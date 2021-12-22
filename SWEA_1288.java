
import java.util.*;




public class SWEA_1288 {
    public static void main(String[]args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();


        int T = sc.nextInt();

        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");


            int N = sc.nextInt();
            HashSet<Integer> set = new HashSet<>();
            for(int i=1; ; i++){
                int tempN = N * i;
                String str = String.valueOf(tempN);
                for(int j=0; j<str.length(); j++){
                    set.add(str.charAt(j)-'0');
                }
                if(set.size() == 10){
                    sb.append(tempN).append("\n");
                    break;
                }
                
            }
            
        }
        
        System.out.println(sb);
        


    }
  
    
    
}