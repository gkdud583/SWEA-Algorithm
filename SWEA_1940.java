
import java.util.*;




public class SWEA_1940 {
    public static void main(String[]args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();


        int T = sc.nextInt();

        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");


            int N = sc.nextInt();
            
            int dist = 0;
            int speed = 0;

            for(int i=0; i<N; i++){
                int comm = sc.nextInt();
                int sp = speed;
                if(comm != 0){
                    sp = sc.nextInt();
                    
                }

                if(comm == 0){
                    //현재 속도 유지해서 1초를 감
                    dist += speed;
                }
                else if(comm == 1){
                    //가속해서 1초를 감
                    speed += sp;
                    dist += speed;
                }
                else{
                    //감속해서 1초를 감
                    if(speed < sp)
                        sp = 0;
                    speed -= sp;
                    dist += speed;
                }

            }
            sb.append(dist).append("\n");
        }
        
        System.out.println(sb);
        
    }
  
}