import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class SWEA_2930{
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        Queue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());

        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");

            heap.clear();
            int N = sc.nextInt();
            for(int i=0; i<N; i++){
                int op = sc.nextInt();
                if(op == 1){
                    int num = sc.nextInt();
                    heap.add(num);
                }
                else if(op == 2){
                    if(heap.isEmpty())
                        sb.append(-1);
                    else
                        sb.append(heap.poll());
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
