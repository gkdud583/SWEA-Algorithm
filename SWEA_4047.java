import java.util.*;

public class SWEA_4047 {
    static HashMap<String, Integer> map = new LinkedHashMap<>();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        init();

        int T = Integer.parseInt(sc.nextLine());
        for(int tc=1; tc<=T; tc++) {
            sb.append("#").append(tc).append(" ");

            HashSet<String> set = new HashSet<>();
            String input = sc.nextLine();
            boolean isBreak = false;
            for(int i=0; i<input.length(); i+=3){
                String s = input.substring(i, i+3);
                if(set.contains(s)){
                    sb.append("ERROR");
                    isBreak = true;
                    break;
                }
                set.add(s);

                String card = s.substring(0,1);
                map.replace(card, map.get(card)+1);
            }
            if(!isBreak)
            {
                for (String s : map.keySet()) {
                    sb.append(13 - map.get(s)).append(" ");
                }
            }
            for (String s : map.keySet()) {
                map.replace(s, 0);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    private static void init() {
        map.put("S", 0);
        map.put("D", 0);
        map.put("H", 0);
        map.put("C", 0);
    }


}