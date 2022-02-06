import java.util.*;
import java.io.*;

class Direction{
    int num;
    char alphabet;
    char sign;
    Direction(int num, char alphabet, char sign){
        this.num = num;
        this.alphabet = alphabet;
        this.sign = sign;
    }
    public char getAlphabet(){
        return this.alphabet;
    }
    public char getSign(){
        return this.sign;
    }
    public int getNum(){
        return this.num;
    }
}
class Location{
    int y;
    int x;
    Direction d;
    Location(int y, int x, Direction d){
        this.y = y;
        this.x = x;
        this.d = d;
    }
    public void setDirection(Direction d){
        this.d = d;
    }
    public void setLocation(int y, int x){
        this.y = y;
        this.x = x;    
    }
}
class Solution
{

    static ArrayList<Direction> directionList = new ArrayList<>();
    static final int MOVE_Y[] = {-1,1,0,0};
    static final int MOVE_X[] = {0,0,-1,1};
    static int H = 0;
    static int W = 0;
    static char map[][];
    static Location trainLoc = null;

	public static void main(String args[]) throws Exception
	{
     

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        directionList.add(new Direction(0, 'U', '^'));
        directionList.add(new Direction(1, 'D', 'v'));
        directionList.add(new Direction(2, 'L', '<'));
        directionList.add(new Direction(3, 'R', '>'));
        directionList.add(new Direction(4, ' ', ' '));


        int T = Integer.parseInt(sc.nextLine());
        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");
            String input[] = sc.nextLine().split(" ");

            H = Integer.parseInt(input[0]);
            W = Integer.parseInt(input[1]);

            map = new char[H][W];
            for(int i=0; i<H; i++){
                input = sc.nextLine().split("");
                for(int j=0; j<W; j++){
                    map[i][j] = input[j].charAt(0);
                    if(map[i][j] == '^' || map[i][j] == 'v' || map[i][j] == '>' || map[i][j] == '<'){
                        //전차의 위치
                        trainLoc = new Location(i,j,findDirection(map[i][j]));
                    }
                }
            }

            int N = Integer.parseInt(sc.nextLine());
            input = sc.nextLine().split("");
            for(int i=0; i<N; i++){
                if(i == N-1){
                    int t = 4;
                }
                Direction command = findDirection(input[i].charAt(0));
                processCommand(command);
            }

            for(int i=0; i<H; i++){
                for(int j=0; j<W; j++){
                    sb.append(map[i][j]);
                }
                sb.append("\n");
            }

            
        }
        System.out.println(sb);
	}
    static Direction findDirection(char command){
        for(int i=0; i<directionList.size(); i++){
            Direction d = directionList.get(i);
            if(d.getAlphabet() == command || d.getSign() == command){
                return d;
            }
        }
        return directionList.get(directionList.size()-1);
    }
    static void processCommand(Direction command){
        int commandNum = command.getNum();
        if(commandNum <= 3){
            //이동 명령

            trainLoc.setDirection(command);
            map[trainLoc.y][trainLoc.x] = command.getSign();
            int moveY = trainLoc.y + MOVE_Y[commandNum];
            int moveX = trainLoc.x + MOVE_X[commandNum];
            if(isPossible(moveY, moveX)){
                map[trainLoc.y][trainLoc.x] = '.';
                map[moveY][moveX] = command.getSign();
                trainLoc.setLocation(moveY, moveX);
            }
        }else{
            //슈팅 명령
            int y = trainLoc.y;
            int x = trainLoc.x;
            int d = trainLoc.d.getNum();
            while(true){
                int moveY = y + MOVE_Y[d];
                int moveX = x + MOVE_X[d];
                y = moveY;
                x = moveX;
                //벽을 만나거나 맵 밖으로 나갈때까지 전진함
                if(isOutOfArray(moveY, moveX))
                    break;
                if(map[moveY][moveX] == '*' || map[moveY][moveX] == '#'){
                    //벽을 만남
                    if(map[moveY][moveX] == '*'){
                        map[moveY][moveX] = '.';
                    }
                    break;
                }
            }
        }
    }
    static boolean isOutOfArray(int y, int x){
        if(y >= 0 && y < H && x >= 0 && x < W){
            return false;
        }
        return true;
    }
    static boolean isPossible(int y, int x){
        if(!isOutOfArray(y, x) && map[y][x] == '.')
            return true;
        return false;
    }

    
}