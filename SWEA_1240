import java.util.*;


class Solution
{
    static HashMap<String, Integer> table = new HashMap<>();
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

        StringBuffer sb = new StringBuffer();

        table.put("0001101",0);
        table.put("0011001",1);
        table.put("0010011",2);
        table.put("0111101",3);
        table.put("0100011",4);
        table.put("0110001",5);
        table.put("0101111",6);
        table.put("0111011",7);
        table.put("0110111",8);
        table.put("0001011",9);


        int T = Integer.parseInt(sc.nextLine());

        for(int tc=1; tc<=T; tc++){
            String input[] = sc.nextLine().split(" ");

            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
    
            sb.append("#").append(tc).append(" ");

            StringBuffer code = new StringBuffer();
            for(int i=0; i<N; i++){
                input = sc.nextLine().split("");
                for(int j=0; j<M; j++){
                    code.append(input[j]);
                }
            }
            //1로 끝나는 56길이의 문자열 찾음.
            String passCode = "";
            for(int s=code.length()-1; s>=0; s--){
                if(code.charAt(s)-'0' == 1){
                    passCode = code.substring(s - 55, s+1);
                    break;
                }
            }
            //암호코드 확인
            sb.append(isCorrect(passCode)).append("\n");


           
        }
        System.out.println(sb);
        
    }
    static int isCorrect(String passCode){
        StringBuffer parsedPassCode = new StringBuffer();
        parsedPassCode.append(0);

        int sum = 0;
        int start = 0;

        while(start + 7 <= passCode.length()){
            String s = passCode.substring(start, start+7);
            int num = table.get(s);
            parsedPassCode.append(num);
            sum += num;
            start += 7;
        }
        int oddSum = 0;
        int evenSum = 0;
        oddSum += parsedPassCode.charAt(1)-'0' + parsedPassCode.charAt(3)-'0' + parsedPassCode.charAt(5)-'0' + parsedPassCode.charAt(7)-'0';
        evenSum += parsedPassCode.charAt(2)-'0' + parsedPassCode.charAt(4)-'0' + parsedPassCode.charAt(6)-'0';

        int verificationCode = oddSum * 3 + evenSum + parsedPassCode.charAt(8)  -'0';

        return verificationCode % 10 == 0 ? sum : 0;
    }
    
}