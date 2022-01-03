import java.util.*;

class Location{
    int index;
    int heigh;

    Location(int index, int height){
        this.index = index;
        this.heigh = height;
    }
}
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

        StringBuffer sb = new StringBuffer();
        int T = 10;
       
        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");

            int C = sc.nextInt();
            ArrayList<Location> list = new ArrayList<>();

            for(int i=0; i<100; i++){
                list.add(new Location(i, sc.nextInt()));
            }

            //덤프 횟수 만큼 진행
            for(int i=1; i<=C; i++){
                Collections.sort(list, new Comparator<Location>(){
                    @Override
                    public int compare(Location o1, Location o2) {
                        return o1.heigh - o2.heigh;
                    }
                });

                //높이가 가장 높은 상자 탑중에서 하나를 높이가 가장 낮은 쪽으로 이동
                list.get(list.size()-1).heigh -= 1;
                list.get(0).heigh += 1;
                
            }
            Collections.sort(list, new Comparator<Location>(){
                @Override
                public int compare(Location o1, Location o2) {
                    return o1.heigh - o2.heigh;
                }
            });
            sb.append(list.get(list.size()-1).heigh - list.get(0).heigh).append("\n");
        }
        System.out.println(sb);
        
    }
}