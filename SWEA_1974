
import java.util.*;
import java.io.*;



public class SWEA_1974 {
    public static void main(String[]args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int T = sc.nextInt();

        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");

            int map[][] = new int[9][9];
            
            for(int r=0; r<9; r++){
                for(int c=0; c<9; c++){
                    map[r][c] = sc.nextInt();
                }
            }
            sb.append(solve(map)).append("\n");
        }
        System.out.println(sb);
        
    }
    static int solve(int map[][]){
        //row 체크
        for(int r=0; r<9; r++){
            HashSet<Integer> set = new HashSet<>();
            for(int c=0; c<9; c++){
                set.add(map[r][c]);
            }
            if(set.size() != 9)
                return 0;
        }

        //col 체크
        for(int c=0; c<9; c++){
            HashSet<Integer> set = new HashSet<>();
            for(int r=0; r<9; r++){
                set.add(map[r][c]);
            }
            if(set.size() != 9)
                return 0;
        }

        //map체크
        for(int r=0; r<9;){
            for(int c=0; c<9;){
                if(check(r,c,3,map) == 0)
                    return 0;
                c += 3;
            }
            r += 3;
        }
        return 1;
    }
    static int check(int y, int x, int s, int map[][]){
        HashSet<Integer> set = new HashSet<>();
        for(int r=y; r<y+3; r++){
            for(int c=x; c<x+3; c++){
                set.add(map[r][c]);
            }
        }
        return set.size() == 9 ? 1 : 0;
    }
}