package exhaustive_search;

import java.util.ArrayList;
import java.util.Arrays;

public class ExhaustiveSearch1 {
    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;

        for (int i = 1; i <= sum; i++) {
            if (sum % i == 0 && i > 2 && i >= sum / i) {
                int result = (i - 2) * (sum / i - 2);
                if (result == yellow) {
                    answer[0] = i;
                    answer[1] = sum / i;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(8, 1)));
    }
}
