import java.util.*;


public class SWEA_3750{
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int TC = sc.nextInt();

        for(int tc=1; tc<=TC; tc++) {
            sb.append("#").append(tc).append(" ");

            long N = sc.nextLong();
            long sum = 0;

            do{
                sum = 0;
                while(N > 0){
                    sum += N % 10;
                    N = N / 10;
                }
                N = sum;
            }while(sum >= 10);
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}
