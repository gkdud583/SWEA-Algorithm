import java.util.*;


public class SWEA_3314{
    public static final int COUNT = 5;
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int TC = Integer.parseInt(sc.nextLine());

        for(int tc=1; tc<=TC; tc++) {
            sb.append("#").append(tc).append(" ");
            int sum = 0;
            for(int j = 0; j < COUNT; j++){
                int score = sc.nextInt();
                sum += score < 40 ? 40 : score;
            }
            sb.append((int)(sum / COUNT)).append("\n");
        }
        System.out.println(sb);
    }
}
