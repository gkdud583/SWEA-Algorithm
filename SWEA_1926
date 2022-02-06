
import java.util.*;
import java.io.*;



public class SWEA_1926 {
    public static void main(String[]args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int N = sc.nextInt();
        for(int i=1; i<=N; i++){
            int n = i;
            int count = 0;
            while(n > 0){
                int num = n % 10;
                n /= 10;
                if(num == 3 || num == 6 || num == 9){
                    count++;
                    sb.append("-");
                }

            }
            if(count == 0){
                sb.append(i);
            }
            sb.append(" ");
            
        }
        System.out.println(sb);
    }
}