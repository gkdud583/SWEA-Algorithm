
import java.util.*;
import java.io.*;



public class SWEA_2070 {
    public static void main(String[]args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int T = sc.nextInt();

        for(int tc=1; tc<=T; tc++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            sb.append("#" + tc);
            if(a > b)
                sb.append(" >");
            else if(a < b)
                sb.append(" <");
            else
                sb.append(" =");
            sb.append("\n");
        }
        System.out.println(sb);

    }
}