
import java.util.*;
import java.io.*;



public class SWEA_2072 {
    public static void main(String[]args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int T = Integer.parseInt(sc.nextLine());

        for(int i=0; i<T; i++){
            String input[] = sc.nextLine().split(" ");
            int sum = 0;
            for(int j=0; j<10; j++){
                int v = Integer.parseInt(input[j]);
                if(v % 2 == 1){
                    sum += v;
                }
            }
            sb.append("#" + (i+1) + " " + sum + "\n");
        }
        System.out.println(sb);

    }
}