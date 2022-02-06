
import java.util.*;




public class SWEA_1928 {
    public static void main(String[]args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();


        int T = Integer.parseInt(sc.nextLine());

        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");


            //Base64 Encoding 된 String
            String encodedStr = sc.nextLine();

            //Decoding
            sb.append(decodeStr(encodedStr)).append("\n");

           
        }
        
        System.out.println(sb);
        


    }
  
    static String decodeStr(String encodedStr)
    {
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<encodedStr.length(); i++){
            int c = (int)encodedStr.charAt(i);

            //대문자
            if(c >= 65 && c <= 90){
                c -= 65;
            }
            //소문자
            else if(c >= 97 && c <= 122){
                c -= 71;
            }
            //숫자
            else if(c >= 48 && c <= 57){
                c += 4;
            }
            //+
            else if(c == 43){
                c = 62;
            }
            // /
            else if(c == 47){
                c = 63;
            }
            
            StringBuffer binaryStr = new StringBuffer(Integer.toBinaryString(c));
            
            while(binaryStr.length() < 6){
                binaryStr.insert(0, '0');
            }
            sb.append(binaryStr.toString());
        }

        StringBuffer ret = new StringBuffer();

        for(int i=0; i+8 < sb.length(); i+=8){
            String b = sb.substring(i, i+8);
            
            //2진수 10진수로 바꿈 
            int dec = 0;

            int value = 128;
            for(int j=0; j<8; j++){
                if(b.charAt(j) == '1'){
                    dec += value;
                }
                value /= 2;
            }

            ret.append((char)dec);


        }
        ret.append(".");
        return ret.toString();
    }
    
}