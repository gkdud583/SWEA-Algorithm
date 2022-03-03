import java.util.*;

public class SWEA_6692 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();


        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc).append(" ");

            int N = sc.nextInt();

            double salary = 0;
            for(int i=0; i<N; i++){
                double p = sc.nextDouble();
                int n = sc.nextInt();

                salary += p * n;

            }
            sb.append(salary).append("\n");
        }
        System.out.println(sb);
    }


}