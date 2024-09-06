package algorithm;

import java.util.*;


public class Programmers005 {
    static String begin = "hit";
    static String target = "cog";
    static String[] words = {"hot", "dot", "dog", "lot", "log"};
    static int[] visited = new int[55];
    static Queue<String> q = new LinkedList<>();

    public static void main(String[] args) {
        int answer = 0;
        if (Arrays.asList(words).indexOf(target) == -1) {
            System.out.println(answer);
            return;

        }

        q.add(begin);
        while (!q.isEmpty()) {
            String s = q.poll();
            for (int i = 0; i < words.length; i++) {
                if (visited[i] >= 1) continue;    //방문했으면 넘어감

                int count = 0;
                for (int j = 0; j < begin.length(); j++) {   //글자의 1자리만 다를때
                    if (s.charAt(j) != words[i].charAt(j)) {
                        count++;
                    }
                }
                if (count == 1) {

                    if (s.equals(begin)) {
                        visited[i] = 1;
                    } else {
                        visited[i] = visited[Arrays.asList(words).indexOf(s)] + 1;  //
                        if (words[i].equals(target)) {
                            answer = visited[i];
                            System.out.println(answer);
                            return;
                        }
                    }
                    q.add(words[i]);
                }
            }
        }
    }
}
