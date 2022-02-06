import java.util.*;
class Solution
{
    static int max = 0;
    static final int SIZE = 100;

	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

        StringBuffer sb = new StringBuffer();

        int T = 10;

        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(Integer.parseInt(sc.nextLine())).append(" ");

            max = 0;
            char map[][] = new char[SIZE][SIZE];
            
            for(int i=0; i<SIZE; i++){
                String input[] = sc.nextLine().split("");
                for(int j=0; j<SIZE; j++){
                    map[i][j] = input[j].charAt(0);
                }
            }
            solve(map);
            sb.append(max).append("\n");
        }
        System.out.println(sb);
	}
    static void solve(char map[][]){
        for(int i=0; i<SIZE; i++){
            for(int j=0; j<SIZE; j++){
                if(i == 39 && j == 31){
                    int t = 3;
                }
                rowCheck(i, j, map);
                colCheck(i, j, map);
            }
        }
    }
    
    static void rowCheck(int r, int c, char map[][]){
        StringBuffer sb = new StringBuffer();
        for(int i=r; i<SIZE; i++){

             sb.append(map[i][c]);
             String original = sb.toString();
             StringBuffer temp = new StringBuffer(sb.toString());
             String reverse = temp.reverse().toString();
  
             if(original.equals(reverse)){
                max = Math.max(max, original.length());
                if(max == 19){
                    int t = 3;
                }
             }
 

        }
    }

    
    
    static void colCheck(int r, int c, char map[][]){
        StringBuffer sb = new StringBuffer();
        for(int i=c; i<SIZE; i++){
            //지금까지 회문이 유지되었다고 가정
            sb.append(map[r][i]);
            String original = sb.toString();
            StringBuffer temp = new StringBuffer(sb.toString());
            String reverse = temp.reverse().toString();
 
            if(original.equals(reverse)){
               max = Math.max(max, original.length());
               if(max == 19){
                   int t = 3;
               }
            }


        }
    }
}