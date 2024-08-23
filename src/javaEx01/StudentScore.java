package javaEx01;

public class StudentScore {
    public static void main(String[] args) {
        // 3명의 학생
        int[][] scores ={
                {90,70,80,100},  //1번 학생
                {85,65,77,90},  //2번 학생
                {80,75,85,95}   //3번 학생

        };

        //학생별로 평균 점수를 계산하고 출력

        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) {

                sum += scores[i][j];

            }
            double avg = (double) sum / scores[i].length;
            System.out.println((i+1) +"번 학생의 평균 점수 : " +avg);
        }




    }// main()
}
