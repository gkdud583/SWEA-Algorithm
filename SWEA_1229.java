import java.util.*;

public class SWEA_1229 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int T = 10;
        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");

            int N = Integer.parseInt(sc.nextLine());
            ArrayList<Integer> list = new ArrayList<>();

            String input[] = sc.nextLine().split(" ");
            for(int i=0; i<N; i++){
                list.add(Integer.parseInt(input[i]));
            }

            int M = Integer.parseInt(sc.nextLine());
            input = sc.nextLine().split(" ");
            int index = -1;
            for(int i=0; i<M; i++){
                char command = input[++index].charAt(0);
                if(command == 'I'){
                    int X = Integer.parseInt(input[++index]);
                    int Y = Integer.parseInt(input[++index]);
                    for(int j=0; j<Y; j++){
                        list.add(X++, Integer.parseInt(input[++index]));
                    }
                }else{
                    int X = Integer.parseInt(input[++index]);
                    int Y = Integer.parseInt(input[++index]);

                    for(int j=0; j<Y; j++){
                        list.remove(X);
                    }
                }
            }
            for(int i=0; i<10; i++){
                sb.append(list.get(i)).append(" ");
            }
            sb.append("\n");


        }
        System.out.println(sb);

    }


}