
import java.util.*;
import java.io.*;



public class SWEA_2071 {
    public static void main(String[]args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int T = Integer.parseInt(sc.nextLine());

        for(int i=0; i<T; i++){
            String input[] = sc.nextLine().split(" ");
            double sum = 0;
            for(int j=0; j<10; j++){
                int v = Integer.parseInt(input[j]);
                sum += v;
            }
            sb.append("#" + (i+1) + " " + String.format("%.0f", sum/10) + "\n");
        }
        System.out.println(sb);

    }
}