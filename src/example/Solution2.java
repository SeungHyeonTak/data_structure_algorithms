package example;

public class Solution2 {
    public static int solution(String t, String p) {
        int answer = 0;

        int pLen = p.length();

        for (int i = 0; i < t.length() - pLen + 1; i++) {
            if (Long.parseLong(p) >= Long.parseLong(t.substring(i, pLen + i))) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("500220839878", "7"));
    }
}
