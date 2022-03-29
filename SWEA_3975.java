import java.util.*;


public class SWEA_3975{
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int TC = sc.nextInt();
        for(int tc=1; tc<=TC; tc++) {
            sb.append("#").append(tc).append(" ");

            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();

            double winningRateE = A / (double)B * 100;
            double winningRateB = C / (double)D * 100;

            if(winningRateE > winningRateB){
                sb.append("ALICE").append("\n");
            }else if(winningRateB > winningRateE){
                sb.append("BOB").append("\n");
            }else{
                sb.append("DRAW").append("\n");
            }



        }
        System.out.println(sb);
    }

}