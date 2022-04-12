
import java.util.Scanner;

public class SWEA_5162 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int T = sc.nextInt();

		StringBuffer sb = new StringBuffer();

		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");

			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();

			int sum = 0;
			if(A < B){
				sum += C / A;
				C %= A;
				sum += C / B;
			}else{
				sum += C / B;
				C %= A;
				sum += C / A;
			}
			sb.append(sum).append("\n");
		}

		System.out.println(sb);

	}

}