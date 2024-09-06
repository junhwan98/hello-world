package algorithm;

public class Programmers49993 {

    public static void main(String[] args) {

        System.out.println(solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"}));
    }

    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        int[] skillSequence = new int[26];
        for (int i = 0; i < skill.length(); i++) {  // 스킬 순서 배열에 순서를 입력
            char c = skill.charAt(i);
            skillSequence[c - 'A'] = i + 1;
        }

        for (String s : skill_trees) {
            int sequence = 1;
            for (char c : s.toCharArray()) {
                if (skillSequence[c - 'A'] == 0) continue;  //순서에 상관 없는 스킬
                else if (skillSequence[c - 'A'] == sequence) {
                    sequence++;
                    continue;
                }
                else {
                    answer--;
                    break;
                }
            }
            answer++;

        }
        return answer;
    }
}
