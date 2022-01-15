import java.util.*;
class Solution
{

	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

        StringBuffer sb = new StringBuffer();

        int T = Integer.parseInt(sc.nextLine());
        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");
            String input = sc.nextLine();
            int inputArray[] = getInputArray(input);
            sb.append(solve(inputArray)).append("\n");
           
        }
        System.out.println(sb);
	}

    static int solve(int inputArray[]){

        int count = 0;
        int len = inputArray.length;
        int originalArray[] = new int[len];
        for(int i=0; i<len; i++){
            if(inputArray[i] != originalArray[i]){
                count++;
                for(int j=i; j<len; j++){
                    originalArray[j] = inputArray[i];
                }
            }
        }
        return count;
        
    }
    static int[] getInputArray(String input){
        int array[] = new int[input.length()];
        
        for(int i=0; i<input.length(); i++){
            array[i] = input.charAt(i) - '0';
        }
        return array;
    }
}