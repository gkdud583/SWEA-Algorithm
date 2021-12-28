
import java.util.*;




public class SWEA_1206 {
    public static void main(String[]args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();


        int T = 10;

        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");

            int N = sc.nextInt();
            int possibleHousehold = 0;
            ArrayList<Integer> buildingList = new ArrayList<>();

            for(int i=0; i<N; i++){
                buildingList.add(sc.nextInt());
            }
            for(int i=0; i<buildingList.size(); i++){
                
                
                int cur = buildingList.get(i);
                int biggestBuilding = 0;
                if(cur > 0){
                    boolean isPossible = true;
                    for(int j=i-1; j>=i-2; j--){
                        int leftBuilding = buildingList.get(j);
                        if(leftBuilding >= cur){
                            isPossible = false;
                            break;
                        }
                        biggestBuilding = Math.max(biggestBuilding, leftBuilding);
                    }
                    if(isPossible){
                        for(int j=i+1; j<=i+2; j++){
                            int rightBuilding = buildingList.get(j);
                            if(rightBuilding >= cur){
                                isPossible = false;
                                break;
                            }
                            biggestBuilding = Math.max(biggestBuilding, rightBuilding);

                        }
                    }
                    if(isPossible){
                        possibleHousehold += cur - biggestBuilding;
                    }
                }
                
            
                
            }
            sb.append(possibleHousehold).append("\n");
        }
        
        System.out.println(sb);
        
    }
    
  
}