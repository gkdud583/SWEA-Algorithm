
import java.util.*;
import java.io.*;



public class SWEA_1961 {
    public static void main(String[]args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int T = sc.nextInt();


        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append("\n");

            int N = sc.nextInt();

            int map[][] = new int[N][N];

            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++)
                    map[i][j] = sc.nextInt();
            }
            ArrayList<int[][]> list = new ArrayList<>();

            rotate(N,list,map); //90도
            rotate(N,list,map); //180도
            rotate(N,list,map); //270도

             
            int r = 0;
            for(int i=0; i<N; i++){
                for(int j=0; j<3; j++){
                    for(int k=0; k<N; k++){
                        sb.append(list.get(j)[r][k]);
                    }
                    sb.append(" ");
                }
                r++;
                sb.append("\n");
            }
            
        }
        System.out.println(sb);
        


    }
    static void rotate(int N, ArrayList<int[][]> list, int map[][]){
        int r = 0;
        int c = N-1;
        int tempMap[][] = new int[N][N];

        for(int i=0; i<N; i++){ //열
            for(int j=0; j<N; j++) //행
            {
                tempMap[r][c] = map[j][i];
                c--;
            }
            r++;
            c = N-1;
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                map[i][j] = tempMap[i][j];
            }
        }
        list.add(tempMap);
    }
    
}