package algorithm;


import java.util.*;

public class Programmers004 {


    public static void main(String[] args) {

        int[] works = {2,1,2};
        int n = 1;
        int sum = 0;
        long answer=0;
for(int i : works){
    sum +=i;
}
if(sum <= n){
    answer = 0L;
}
Arrays.sort(works);
        while(n>0){
            for(int i= works.length-1 ; i>=0 ; i--) {

                if(i==0){   //남은 일의 작업량이 모두 같을 때
                    works[0]--;
                    n--;
                    break;
                }
                else if (works[i] > works[i-1]) {  //앞에있는 숫자가 더 클때
                    works[i]--;
                    n--;
                    break;
                }
            }
        }

        for(int i : works){
            answer += (long)i*i;
        }

        System.out.println(answer);
    }

}
