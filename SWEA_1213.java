import java.util.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

        StringBuffer sb = new StringBuffer();

        int T = 10;

        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(Integer.parseInt(sc.nextLine())).append(" ");
            
            String findStr = sc.nextLine();
            String inputStr = sc.nextLine();

        
            sb.append(solve(findStr, inputStr)).append("\n");
            
        }
        System.out.println(sb);
        
    }
    static int solve(String findStr, String inpuStr){
        int count = 0;

        for(int i=0; i<=inpuStr.length() - findStr.length(); i++){
            String subStr = inpuStr.substring(i, i + findStr.length());
            if(subStr.equals(findStr)){
                count++;
            }
        }
        return count;
    }
    
    
    
}