import java.util.Scanner;

public class SWEA_3131{
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        for(int i=2; i<1000000; i++){
            boolean isPrime = true;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb);

    }
}
