package greedy;

import java.util.Arrays;

public class Greedy1 {
    public static int solution(int[] people, int limit) {
        int answer = 0;
        int first = 0;
        int last = people.length - 1;

        Arrays.sort(people);

        while (first <= last) {
            answer++;
            if (people[first] + people[last] <= limit) {
                first++;
            }
            last--;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{70, 50, 80, 50}, 100));
    }
}
