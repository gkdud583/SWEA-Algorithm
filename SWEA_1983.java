
import java.util.*;
import java.io.*;


class Student{
    int n;
    int s;

    Student(int n, int s){
        this.n = n;
        this.s = s;
    }
}

public class SWEA_1983 {
    public static void main(String[]args) throws Exception{

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        String gradeTable[] = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};

        int T = sc.nextInt();


        for(int tc=1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");

            int N = sc.nextInt();

            int K = sc.nextInt();

            ArrayList<Student> list = new ArrayList<>();

            for(int i=1; i<=N; i++){
                double total = 0;
                int t1 = sc.nextInt();
                int t2 = sc.nextInt();
                int a = sc.nextInt();

                total += t1 * 0.35;
                total += t2 * 0.45;
                total += a * 0.2;

                list.add(new Student(i, (int)Math.round(total)));
            }

            Collections.sort(list, new Comparator<Student>(){
                @Override
                public int compare(Student o1, Student o2) {
                    return o2.s - o1.s;
                }
            });
            int i = 0;
            for(int g=0; g<10; g++){
                int max = i + N / 10;
                while(i < max){
                    Student student = list.get(i);
                    if(student.n == K){
                        sb.append(gradeTable[g]).append("\n");
                    }
                    i++;
                }
            }
        }
        System.out.println(sb);
        


    }
    
    
}