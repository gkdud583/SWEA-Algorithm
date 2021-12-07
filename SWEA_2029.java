
import java.util.*;
import java.io.*;



public class SWEA_2029 {
    public static void main(String[]args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int T = sc.nextInt();

        for(int tc = 1; tc<=T; tc++){
            sb.append("#"+tc+" ");

            int a = sc.nextInt();
            int b = sc.nextInt();

            sb.append(a / b + " ");
            sb.append(a % b + "\n");

        }
        System.out.println(sb);
    }
}