import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Participant{
    private int score; // 점수
    private int correctCount; // 맞은 문제 수
    private int num; // 번호


    public Participant(int num) {
        this.num = num;
    }

    public int getScore() {
        return score;
    }

    public int getCorrectCount() {
        return correctCount;
    }

    public int getNum() {
        return num;
    }

    public void updateInfo(int score){
        this.correctCount++;
        this.score += score;
    }
}
public class SWEA_8888 {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception{

        StringBuffer sb = new StringBuffer();

        int TC = Integer.parseInt(bf.readLine());
        for(int tc=1; tc<=TC; tc++) {
            sb.append("#").append(tc).append(" ");

            String input[] = bf.readLine().split(" ");

            int N = Integer.parseInt(input[0]);
            int T = Integer.parseInt(input[1]);
            int P = Integer.parseInt(input[2]);

            Participant[] participants = new Participant[N]; // 각 참가자의 시험 결과 정보
            int result[][] = new int[N][T]; // 각 참가자의 시험 결과
            int testScore[] = new int[T]; // 문제 점수


            getTestScore(N, T, result, testScore);
            getParticipantTestResult(N, T, participants, result, testScore);

            Arrays.sort(participants, new Comparator<Participant>() {
                @Override
                public int compare(Participant o1, Participant o2) {
                    if(o1.getScore() < o2.getScore()){
                        return 1;
                    }else if(o1.getScore() > o2.getScore()){
                        return -1;
                    }else{
                        if(o1.getCorrectCount() < o2.getCorrectCount()){
                            return 1;
                        }else if(o1.getCorrectCount() > o2.getCorrectCount()){
                            return -1;
                        }else{
                            if(o1.getNum() > o2.getNum()){
                                return 1;
                            }else if(o1.getNum() < o2.getNum()){
                                return -1;
                            }else
                                return 0;
                        }
                    }
                }
            });

            for(int i=0; i<N; i++){
                Participant participant = participants[i];
                if(participant.getNum() == P-1){
                    //지학
                    sb.append(participant.getScore()).append(" ").append(i+1).append("\n");
                    break;
                }
            }


        }
        System.out.println(sb);
    }

    private static void getParticipantTestResult(int N, int T, Participant[] participants, int[][] result, int[] testScore) {
        for(int i = 0; i< N; i++){
            Participant participant = new Participant(i);
            for(int j = 0; j< T; j++){
                if(result[i][j] == 1){
                    participant.updateInfo(testScore[j]);
                }
            }
            participants[i] = participant;
        }
    }

    private static void getTestScore(int N, int T, int[][] result, int[] testScore) throws Exception{
        for(int i = 0; i< N; i++){
            String input[] = bf.readLine().split(" ");
            for(int j = 0; j< T; j++){
                result[i][j] = Integer.parseInt(input[j]);
                if(result[i][j] == 0){
                    testScore[j]++;
                }
            }
        }
    }

}