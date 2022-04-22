import java.util.*;

public class SWEA_7087 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();


		int T = Integer.parseInt(sc.nextLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");

			int N = Integer.parseInt(sc.nextLine());
			int alphabet[] = new int[26];

			for(int i = 0; i < N; i++) {
				String word = sc.nextLine();
				word = word.toLowerCase(Locale.ROOT);
				alphabet[word.charAt(0)-'a']++;
			}

			int count = 0;
			for(int i = 0; i < 26; i++) {
				if(alphabet[i] == 0)
					break;
				count++;
			}
			sb.append(count).append("\n");
		}
		System.out.println(sb);
	}
}