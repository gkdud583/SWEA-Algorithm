import java.util.*;


class Solution
{
    static final int SIZE = 8;
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

        StringBuffer sb = new StringBuffer();

        int T = 10;

        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");
            
            int L = Integer.parseInt(sc.nextLine());
            char map[][] = new char[SIZE][SIZE];
            
            for(int i=0; i<SIZE; i++){
                String input[] = sc.nextLine().split("");
                for(int j=0; j<SIZE; j++){
                    map[i][j] = input[j].charAt(0);
                }
            }
            sb.append(solve(L, map)).append("\n");
        }
        System.out.println(sb);
        
    }
    static int solve(int L, char map[][]){
        int cnt = 0;

        for(int i=0; i<SIZE; i++){
            for(int j=0; j<SIZE; j++){
                if(rowCheck(L, i, j, map))
                    cnt++;
        
                if(colCheck(L, i, j, map))
                    cnt++;
            }
        }
        return cnt;
    }
    
    static boolean colCheck(int L, int r, int c, char map[][]){
        if(c + L > SIZE)
            return false;
        StringBuffer sb = new StringBuffer();
        for(int i=c; i<c+L; i++){
            sb.append(map[r][i]);
        }

        String original = sb.toString();

        String reverse = sb.reverse().toString();

        return original.equals(reverse) ? true : false;
    }

    
    
    static boolean rowCheck(int L, int r, int c, char map[][]){
        if(r + L > SIZE)
            return false;
        StringBuffer sb = new StringBuffer();
        for(int i=r; i<r+L; i++){
            sb.append(map[i][c]);
        }
        String original = sb.toString();

        String reverse = sb.reverse().toString();

        return original.equals(reverse) ? true : false;
    }
    
    
}