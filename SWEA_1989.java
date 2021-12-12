
import java.util.*;
import java.io.*;



public class SWEA_1989 {
    public static void main(String[]args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int T = Integer.parseInt(sc.nextLine());

        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");

            StringBuffer input = new StringBuffer(sc.nextLine());
            StringBuffer forward = new StringBuffer(input);
            StringBuffer reverse = new StringBuffer(input.reverse());

            if(forward.toString().equals(reverse.toString())){
                sb.append(1).append("\n");
            }else{
                sb.append(0).append("\n");
            }
            
            
        }
        System.out.println(sb);
        


    }
    
}