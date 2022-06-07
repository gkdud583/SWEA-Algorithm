import java.util.*;

class PrimeNumber {
    private int num;
    private HashSet<Integer> includedNumbers = new HashSet<>();

    public PrimeNumber(int num) {
        this.num = num;
    }

    void addNumber(int num) {
        this.includedNumbers.add(num);
    }

    boolean contains(int num) {
        if (includedNumbers.contains(num))
            return true;
        return false;
    }

    public int getNum() {
        return num;
    }
}

public class SWEA_4698 {
    private static final int MIN = 1;
    private static final int MAX = 1000000;
    private static final int MIN_OF_SPECIAL_NUM = 1;
    private static final int MAX_OF_SPECIAL_NUM = 9;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();


        List<PrimeNumber> list = init();

        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc).append(" ");

            int D = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();

            int count = 0;
            for (int i = 0; i < list.size(); i++) {
                PrimeNumber primeNumber = list.get(i);
                if (primeNumber.getNum() > B)
                    break;
                if (primeNumber.getNum() >= A && primeNumber.contains(D))
                    count++;
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }

    private static List<PrimeNumber> init() {
        ArrayList<PrimeNumber> list = new ArrayList<>();

        for (int i = MIN; i <= MAX; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                PrimeNumber primeNumber = new PrimeNumber(i);
                initIncludedNumbers(primeNumber);
                list.add(primeNumber);
            }
        }

        return list;
    }

    private static void initIncludedNumbers(PrimeNumber primeNumber) {
        String s = String.valueOf(primeNumber.getNum());
        for (int i = MIN_OF_SPECIAL_NUM; i <= MAX_OF_SPECIAL_NUM; i++) {
            if (s.contains(String.valueOf(i))) {
                primeNumber.addNumber(i);
            }
        }
    }
}