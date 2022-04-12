
import java.util.Scanner;

public class SWEA_7985 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int T = sc.nextInt();

        StringBuffer sb = new StringBuffer();

        for (int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc).append(" ");

            int K = sc.nextInt(); // 트리의 높이
            int N = (int)Math.pow(2, K) - 1;

            int node[] = new int[N];

            for(int i=0; i<N; i++){
                node[i] = sc.nextInt();
            }

            int tree[] = new int[N+1];

            solve(0, N-1, 1, 0, tree, node);

            int i = 1;
            int n = 0;
            for(int level = 0; level < K; level++){
                n += (int)Math.pow(2, level);
                for(; i <= n; i++){
                    sb.append(tree[i]).append(" ");
                }
                sb.append("\n");
            }
        }

        System.out.println(sb);

    }
    private static void solve(int left, int right, int treeIndex, int nodeIndex, int tree[], int node[]){
        int root = (left + right) / 2;
        tree[treeIndex] = node[root];

        if(left == right)
            return;
        solve(left, root-1, treeIndex*2, root, tree, node);
        solve(root+1, right, treeIndex*2+1, root, tree, node);
    }

}