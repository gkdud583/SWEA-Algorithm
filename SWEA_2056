
import java.util.*;
import java.io.*;



public class SWEA_2056 {
    public static void main(String[]args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        
        int cal[] = new int[13];

        cal[1] = 31;
        cal[2] = 28;
        cal[3] = 31;
        cal[4] = 30;
        cal[5] = 31;
        cal[6] = 30;
        cal[7] = 31;
        cal[8] = 31;
        cal[9] = 30;
        cal[10] = 31;
        cal[11] = 30;
        cal[12] = 31;

        int T = Integer.parseInt(sc.nextLine());

        for(int tc=1; tc<=T; tc++){
            sb.append("#" + tc +" ");

            String input = sc.nextLine();

            int y = Integer.parseInt(input.substring(0, 4));
            int m = Integer.parseInt(input.substring(4, 6));
            int d = Integer.parseInt(input.substring(6));

            if(d >= 1 && d <= cal[m]){
                sb.append(String.format("%04d",y)+"/"+String.format("%02d",m)+"/"+String.format("%02d",d));
            }else
                sb.append(-1);

            sb.append("\n");
        }
        System.out.println(sb);
    }
}