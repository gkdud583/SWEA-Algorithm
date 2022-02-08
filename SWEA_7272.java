import java.util.*;

public class SWEA_7272 {
    static HashMap<Character, Integer> map = new HashMap<>();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        init();

        int T = Integer.parseInt(sc.nextLine());
        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");

            String input[] = sc.nextLine().split(" ");
            String str1 = input[0];
            String str2 = input[1];

            sb.append(compare(str1,str2)).append("\n");
        }
        System.out.println(sb);

    }

    static String compare(String str1, String str2) {
        if(str1.length() != str2.length()){
            return "DIFF";
        }
        for(int i=0; i<str1.length(); i++){
            int n1 = map.get(str1.charAt(i));
            int n2 = map.get(str2.charAt(i));

            if(n1 != n2)
                return "DIFF";
        }
        return "SAME";
    }

    static void init(){
        //CEFGHIJKLMNSTUVWXYZ
        map.put('C', 1);
        map.put('E', 1);
        map.put('F', 1);
        map.put('G', 1);
        map.put('H', 1);
        map.put('I', 1);
        map.put('J', 1);
        map.put('K', 1);
        map.put('L', 1);
        map.put('M', 1);
        map.put('N', 1);
        map.put('S', 1);
        map.put('T', 1);
        map.put('U', 1);
        map.put('V', 1);
        map.put('W', 1);
        map.put('X', 1);
        map.put('Y', 1);
        map.put('Z', 1);

        //ADOPQR
        map.put('A', 2);
        map.put('D', 2);
        map.put('O', 2);
        map.put('P', 2);
        map.put('Q', 2);
        map.put('R', 2);

        //B
        map.put('B', 3);

    }
}