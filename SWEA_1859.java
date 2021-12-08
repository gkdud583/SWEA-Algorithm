
import java.util.*;
import java.io.*;



public class SWEA_1859 {
    public static void main(String[]args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int T = sc.nextInt();

        
        for(int tc = 1; tc<=T; tc++){
            sb.append("#"+tc+" ");

            int N = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();

            for(int i=0; i<N; i++)
                list.add(sc.nextInt());
            
            double profit = 0;
            for(int s=0; s<list.size(); s++){
                int max = list.get(s);
                int e = s;
                for(int end = s; end<list.size(); end++){
                    
                    if(list.get(end) > max){
                        e = end;
                        max = list.get(end);
                    }

                }
                for(int i=s; i<e; i++){
                    profit += max - list.get(i);
                }

                s = e;

                
            }
            sb.append((long)profit).append("\n");
        }
        System.out.println(sb);
    }
}