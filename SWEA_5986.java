
import java.util.ArrayList;
import java.util.Scanner;

public class SWEA_5986 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		ArrayList<Integer> primNums = new ArrayList<>();
		getPrimeNum(999, primNums);

		int T = sc.nextInt();

		StringBuffer sb = new StringBuffer();


		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");

			int N = sc.nextInt();

			int sum  = 0;
			for(int i=0; i<primNums.size(); i++){
				if(primNums.get(i) > N){
					break;
				}
				for(int j=i; j<primNums.size(); j++){
					if(primNums.get(i) + primNums.get(j) > N){
						break;
					}
					for(int k=j; k<primNums.size(); k++){
						if(primNums.get(i) + primNums.get(j) + primNums.get(k) > N){
							break;
						}
						if(primNums.get(i) + primNums.get(j) + primNums.get(k) == N){
							sum++;
						}
					}
				}
			}

			sb.append(sum).append("\n");
		}

		System.out.println(sb);

	}

	private static void getPrimeNum(int max, ArrayList<Integer> primNums) {
		for(int i=2; i<=max; i++){
			boolean isPrime = true;
			for(int j=2; j<=Math.sqrt(i); j++){
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime){
				primNums.add(i);
			}
		}
	}

}