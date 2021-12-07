
import java.util.*;
import java.io.*;



public class SWEA_2043 {
    public static void main(String[]args) throws Exception{

        Scanner sc = new Scanner(System.in);
        
        String input[] = sc.nextLine().split(" ");
        String P = input[0];
        String K = input[1];

        int cnt = 0;
        for(int i=K.charAt(0)-'0'; i<=9; i++){
            for(int j=K.charAt(1)-'0'; j<=9; j++){
                for(int k=K.charAt(2)-'0'; k<=9; k++){
                    cnt++;
                    if(i == P.charAt(0)-'0' && j == P.charAt(1)-'0' && k == P.charAt(2)-'0'){
                        System.out.println(cnt);
                        return;
                    }
                }
            }
        }

    }
}