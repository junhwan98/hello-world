package algorithm;

import java.util.*;

public class Programmers42579 {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        ArrayList<Integer> answer = new ArrayList<>();
        // 1. 장르별 재생횟수 더해서 맵에 저장
        // 2. 고유 번호별 재생횟수 맵에 저장
        //answer 정렬기준 1. 장르별 재생횟수 , 2.노래 재생횟수 상위 2개

        HashMap<String, Integer> num = new HashMap<>(); // 장르별 총 개수
        HashMap<String, HashMap<Integer, Integer>> music = new HashMap<>();
        //장르별 총 개수로정렬
        for (int i = 0; i < plays.length; i++) {
            if (!num.containsKey(genres[i])) {
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(i, plays[i]);
                music.put(genres[i], map);
                num.put(genres[i], plays[i]);
            } else {
                music.get(genres[i]).put(i, plays[i]);
                num.put(genres[i], num.get(genres[i]) + plays[i]);
            }
        }
        List<String> keySet = new ArrayList(num.keySet());
        Collections.sort(keySet, (s1, s2) -> num.get(s2) - (num.get(s1)));

        for (String key : keySet) {
            HashMap<Integer, Integer> map = music.get(key);
            List<Integer> genre_key = new ArrayList(map.keySet());

            Collections.sort(genre_key, (s1, s2) -> map.get(s2) - (map.get(s1)));

            answer.add(genre_key.get(0));
            if (genre_key.size() > 1)
                answer.add(genre_key.get(1));
        }

       for(int i : answer.stream().mapToInt(i->i).toArray()){
           System.out.print(i + " ");
       }
//

    }
}
