import java.text.SimpleDateFormat;
import java.util.*;

public class SWEA_4299 {
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int T = Integer.parseInt(sc.nextLine());
        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");


            int d = sc.nextInt();
            int h = sc.nextInt();
            int m = sc.nextInt();

            if(d < 11 || d == 11 && h < 11 || d == 11 && h == 11 && m < 11)
                sb.append(-1);
            else{
                long diff = 0;
                diff += ((d-11)*24*60);
                diff += ((h-11)*60);
                diff += (m-11);
                sb.append(diff);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

}