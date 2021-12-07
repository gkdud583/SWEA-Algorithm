
import java.util.*;
import java.io.*;



public class SWEA_2027 {
    public static void main(String[]args) throws Exception{

        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<5; i++){
            int count = 0;
            for(int j=0; j<i; j++){
                count++;
                System.out.print("+");
            }
            count++;
            System.out.print("#");
            for(int k=0; k<5-count; k++){
                System.out.print("+");
            }
            System.out.println();
        }
        
    }
}