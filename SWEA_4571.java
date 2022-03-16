import java.util.*;

public class SWEA_4571 {
    static final int DY[] = {-1,0,1,0,-2,-1,0,1,2,1,0,-1};
    static final int DX[] = {0,-1,0,1,0,-1,-2,-1,0,1,2,1};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();


        int T = Integer.parseInt(sc.nextLine());
        for (int tc = 1; tc <= T; tc++) {
            String input = sc.nextLine();
            int len = input.length();

            int rowSize = 5;
            int colSize = len * 5 - (len - 1);

            char arr[][] = new char[rowSize][colSize];

            int y = 2;
            int x = 2;

            for(int i=0; i<len; i++){
                arr[y][x] = input.charAt(i);

                //다이아몬드 만들기
                createDiamond(0, 4, y, x, arr, '.');
                createDiamond(4, 12, y, x, arr, '#');
                x += 4;
            }

            for(int i=0; i<rowSize; i++){
                for(int j=0; j<colSize; j++){
                    if(arr[i][j] == 0)
                        sb.append('.');
                    else
                        sb.append(arr[i][j]);
                }
                sb.append("\n");
            }

        }
        System.out.println(sb);
    }

    private static void createDiamond(int s, int e, int y, int x, char[][] arr, char c) {
        for(int j = s; j< e; j++){
            int ny = y + DY[j];
            int nx = x + DX[j];

            arr[ny][nx] = c;

        }
    }


}