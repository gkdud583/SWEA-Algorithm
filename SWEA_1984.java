
import java.util.*;
import java.io.*;



public class SWEA_1984 {
    public static void main(String[]args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();


        int T = sc.nextInt();



        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");


            int sum  = 0;
            int max = 0, min = 10001;
            for(int i=0; i<10; i++){
                int num = sc.nextInt();
                max = Math.max(max, num);
                min = Math.min(min, num);

                sum += num;
            }
            sum -= max;
            sum -= min;

            double avg = sum / 8.0;
            sb.append(String.format("%.0f", avg)).append("\n");
            

           
        }
        
        System.out.println(sb);
        


    }
    
    
}