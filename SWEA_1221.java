import java.util.*;

class Number{
    int num;
    String str;

    Number(int num, String str){
        this.num = num;
        this.str = str;
    }
    int getNum(){
        return num;
    }
    String getStr(){
        return str;
    }
}
class Solution
{

    static HashMap<String, Integer> map = new HashMap<>();
    static Number table[] = new Number[10];
	public static void main(String args[]) throws Exception
	{
        init();
        
		Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();


        int T = Integer.parseInt(sc.nextLine());
        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append("\n");

            String input[] = sc.nextLine().split(" ");
            int N = Integer.parseInt(input[1]);

            

            ArrayList<Number> list = new ArrayList<Number>();
            input = sc.nextLine().split(" ");
            for(int i=0; i<N; i++){
                list.add(table[map.get(input[i])]);
            }
            Collections.sort(list, new Comparator<Number>(){
                public int compare(Number n1, Number n2) {
                    return n1.getNum() - n2.getNum();
                };
            });
            for(Number num : list){
                sb.append(num.getStr()).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
	}
    static void init(){
        map.put("ZRO", 0);
        map.put("ONE", 1);
        map.put("TWO", 2);
        map.put("THR", 3);
        map.put("FOR", 4);
        map.put("FIV", 5);
        map.put("SIX", 6);
        map.put("SVN", 7);
        map.put("EGT", 8);
        map.put("NIN", 9);

        table[0] = new Number(0, "ZRO");
        table[1] = new Number(1, "ONE");
        table[2] = new Number(2, "TWO");
        table[3] = new Number(3, "THR");
        table[4] = new Number(4, "FOR");
        table[5] = new Number(5, "FIV");
        table[6] = new Number(6, "SIX");
        table[7] = new Number(7, "SVN");
        table[8] = new Number(8, "EGT");
        table[9] = new Number(9, "NIN");
    }
}