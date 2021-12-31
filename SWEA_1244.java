import java.util.*;


class Solution
{
    static int NUM = 0;
    static int COUNT = 0;

	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

        StringBuffer sb = new StringBuffer();
        int T = sc.nextInt();

        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");

            int N = sc.nextInt();
            int K = sc.nextInt();

            //int -> int[] 로 변경 
            int num[] = new int[String.valueOf(N).length()];
            intToArray(num, N);

            //변경 가능 횟수만큼 변경
            NUM = N;
            COUNT = 0;

            solve(num, 0, 0, K);
            //int -> int[]
            intToArray(num, NUM);
            if(COUNT < K){
                //가장 마지막에 바꾼걸 반복해서 바꿈
                int remainCount = K - COUNT;
                while(remainCount >= 2){
                    remainCount -= 2;
                }
               
                
                
                
                if(remainCount == 1){
                     //가장 작은 changeIndex구함.
                  
                    int temp = num[num.length-1];
                    num[num.length-1] = num[num.length-2];
                    num[num.length-2] = temp;
                }
            }
        
            sb.append(arrayToInt(num)).append("\n");
        }
        System.out.println(sb);
        
    }
    static void intToArray(int num[], int N){
        
        String numStr = String.valueOf(N);

        for(int i=0; i<numStr.length(); i++){
            num[i] = numStr.charAt(i) - '0';
        }
    }
    static void solve(int num[], int s, int c, int K){
        
        
        if(c == K)
            return;
        for(int i=s; i<num.length-1; i++){ 
            for(int j=i+1; j<num.length; j++){
                if(num[j] >= num[i]){
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;

                    //int[] -> int
                    int parseNum = arrayToInt(num);
                    
                    if(NUM <= parseNum){
                        NUM = parseNum;
                        COUNT = c + 1;
                    }
                    solve(num, i+1, c+1, K);

                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }

            }
            
            
        }
        
    }
    static int arrayToInt(int num[]){
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<num.length; i++)
            sb.append(num[i]);
        return Integer.parseInt(sb.toString());
    }
}