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
    static int count = 0;
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

        StringBuffer sb = new StringBuffer();

        int T = sc.nextInt();

        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");
            
            int N = sc.nextInt();
            count = 0;
            solve(0, N, new ArrayList<>());
            sb.append(count).append("\n");
        }
        System.out.println(sb);
        
    }
    static void solve(int c, int N, List<Location> list){
        if(c >= N){
            count++;
        }
        for(int i=0; i<N; i++){
            boolean isPossible  =  true;
            for(int j=0; j<list.size(); j++){
                Location loc = list.get(j);
                //열이 겹칠수 있는지 확인
                
                if(i == loc.x){
                    //열이 겹침
                    isPossible = false;
                    break;
                }
                //대각선에 있는지 확인
                {
                    int rd = Math.max(loc.y, c) - Math.min(loc.y, c);
                    int cd = Math.max(loc.x, i) - Math.min(loc.x, i);

                    if(rd == cd){
                        //대각선에 있음
                        isPossible = false;
                        break;
                    }
                }
            }
            if(isPossible){
                Location loc = new Location(c,i);
                list.add(loc);
                solve(c+1, N, list);
                list.remove(loc);
            }
        }

    }
    
    
    
}