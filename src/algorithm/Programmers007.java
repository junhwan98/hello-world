package algorithm;

import java.util.Arrays;
import java.util.LinkedList;

public class Programmers007 {

    public static void main(String[] args) {
        int answer = 0;
        int[] a = {2,2,2,2};
        int[] b = {1,1,1,1};
        Arrays.sort(a);
        Arrays.sort(b);
        LinkedList<Integer> list = new LinkedList<>();
        for(int i : b){
            list.add(i);
        }


//지면 젤 적은거
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < list.size(); j++) {

                Integer num = list.get(j);

                if(a[i]<num){
                    answer++;
                    list.remove(j);
                }
                else if (j == list.size()-1) {

                    System.out.println(answer);
                    return;

                }

            }

        }
        System.out.println(answer);
    }


}
