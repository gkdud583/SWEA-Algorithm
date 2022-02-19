import java.util.*;

public class SWEA_4406 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        String vowel[] = {"a", "e", "i", "o", "u"};
        int T = Integer.parseInt(sc.nextLine());
        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");

            String input = sc.nextLine();


            for(int i=0; i<vowel.length; i++){
                input = input.replaceAll(vowel[i], "");
            }

            sb.append(input).append("\n");



        }
        System.out.println(sb);

    }

}