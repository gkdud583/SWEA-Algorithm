
import java.util.*;
import java.io.*;



public class SWEA_1933 {
    public static void main(String[]args) throws Exception{

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();
        for(int i=1; i<=N/2; i++){
            if(N % i == 0){
                set.add(i);
                set.add(N / i);
    
            }
        }

        ArrayList list = new ArrayList(set);
        Collections.sort(list);
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        
    }
}