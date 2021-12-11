
import java.util.*;
import java.io.*;



public class SWEA_2007 {
    public static void main(String[]args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int T = Integer.parseInt(sc.nextLine());

        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");

            String input = sc.nextLine();
            boolean isfind = false;
            for(int pl=1; pl<=input.length(); pl++){

                String pattern = input.substring(0, pl);

                int nxtIndex = pl;
                String nxt = "";
                if(nxtIndex + pl > input.length()){
                    nxt = input.substring(nxtIndex);
                }
                else{
                    nxt = input.substring(nxtIndex, nxtIndex + pl);
                }

                
                if(pattern.equals(nxt)){
                    isfind = true;
                    sb.append(pl).append("\n");
                    break;
                }
            }
            if(!isfind){
                sb.append(input.length()).append("\n");
            }
            
        }
        System.out.println(sb);
        


    }
    
}