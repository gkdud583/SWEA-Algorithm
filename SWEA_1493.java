import java.util.*;

class Location{
    int y;
    int x;
    Location(int y, int x){
        this.y = y;
        this.x = x;
    }
}
class Solution
{

    static HashMap<String, Integer> locationMap = new HashMap<>();
    static HashMap<Integer, Location> map = new HashMap<>();
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        
        init();
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");
            int P = sc.nextInt();
            int Q = sc.nextInt();
            
            Location pLoc = map.get(P);
        
            Location qLoc = map.get(Q);
            
            Location newLoc = new Location(pLoc.y+qLoc.y, pLoc.x+qLoc.x);
            StringBuffer loc = new StringBuffer();
            loc.append(newLoc.y).append(",").append(newLoc.x);
           
            sb.append(locationMap.get(loc.toString())).append("\n");

        }
        System.out.println(sb);
	}
    static void init(){
        int a = 1; //각 행 시작 수
        int b = 2; //각 행 더해지는 시작 수
        for(int i=1; i<=10000; i++){
            int c = a;
            int d = b;
            for(int j=1; j<=10000; j++){
                StringBuffer sb = new StringBuffer();
                sb.append(i).append(",").append(j);
                locationMap.put(sb.toString(),c);
                map.put(c, new Location(i,j));
                c += d++;

                if(j > 280){
                    break;
                }
                
            }
            
            
            a += i;
            b++;
            if(i > 282){
                break;
            }
        }

    }
}