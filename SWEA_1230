import java.util.*;
import java.io.*;
class Solution
{


	public static void main(String args[]) throws Exception
	{
     

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int T = 10;
        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");
            int N = sc.nextInt();
            List<Integer> list = new LinkedList<>();
            for(int i=0; i<N; i++){
                list.add(sc.nextInt());
            }
            int K = sc.nextInt();
            for(int i=0; i<K; i++){
                char c = sc.next().charAt(0);
                if(c == 'I'){
                    int X = sc.nextInt();
                    int Y = sc.nextInt();
                    int cnt = X + Y;
                    for(int j=X; j<cnt; j++){
                        list.add(j, sc.nextInt());
                    }
                }
                else if(c == 'D'){
                    int X = sc.nextInt();
                    int Y = sc.nextInt();
                    int cnt = X + Y;
                    for(int j=X; j<cnt; j++){
                        list.remove(X);
                    }
                }
                else{
                    int Y = sc.nextInt();
                    for(int j=0; j<Y; j++){
                        list.add(sc.nextInt());
                    }
                }
            }
            for(int j=0; j<10; j++){
                sb.append(list.get(j)).append(" ");
            }
            sb.append("\n");
            
            
        }
        System.out.println(sb);
	}
    

    
}