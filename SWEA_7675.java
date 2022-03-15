import java.util.*;

public class SWEA_7675 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();


        int T = Integer.parseInt(sc.nextLine());
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc).append(" ");


            int N = Integer.parseInt(sc.nextLine());

            String sentences[] = sc.nextLine().split("\\.|\\?|\\!");
            for(int i=0; i< sentences.length; i++){
                int count = 0;

                String words[] = sentences[i].split(" ");

                for(int j=0; j<words.length; j++){
                    if(words[j].equals(""))
                        continue;
                    boolean isName = true;
                    char firstChar = words[j].charAt(0);
                    if(firstChar >= 'A' && firstChar <= 'Z'){
                        //첫 글자가 대문자
                        for(int k=1; k<words[j].length(); k++){
                            char curChar = words[j].charAt(k);
                            if(!(curChar >= 'a' && curChar <= 'z')){
                                isName = false;
                                break;
                            }
                        }
                        if(isName){
                            count++;
                        }
                    }
                }
                sb.append(count).append(" ");
            }
            sb.append("\n");


        }
        System.out.println(sb);
    }


}