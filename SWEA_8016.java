import java.util.Scanner;

public class SWEA_8016{
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");

            long N = sc.nextInt();

            sb.append((N-1)*(N-1)*2+1).append(" ");
            sb.append(N*N*2-1).append("\n");
        }

        System.out.println(sb);
    }
}
