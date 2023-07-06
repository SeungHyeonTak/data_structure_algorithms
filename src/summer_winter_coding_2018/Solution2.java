package summer_winter_coding_2018;

public class Solution2 {
    public static int solution(int n) {
        int answer = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n--;
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(5));
    }
}
