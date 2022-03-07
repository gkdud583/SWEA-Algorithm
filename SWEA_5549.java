import java.util.*;

public class SWEA_5549 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();


        int T = Integer.parseInt(sc.nextLine());
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc).append(" ");

            String input = sc.nextLine();
            if((input.charAt(input.length()-1) - '0') % 2 == 0){
                sb.append("Even");
            }else{
                sb.append("Odd");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }


}