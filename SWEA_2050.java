
import java.util.*;
import java.io.*;



public class SWEA_2050 {
    public static void main(String[]args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        String input = sc.nextLine();

        for(int i=0; i<input.length(); i++){
            char c = input.charAt(i);

            if(c >= 97 && c <= 122){
                c = (char)(c - 32);
            }

            sb.append(c - 64).append(" ");
        }
        System.out.println(sb);
    }
}