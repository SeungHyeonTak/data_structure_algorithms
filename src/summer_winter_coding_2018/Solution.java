package summer_winter_coding_2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        int count = 1;
        List<String> strList = new ArrayList<>();
        strList.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            if (strList.contains(words[i]))
                break;

            if (words[i].charAt(0) == words[i - 1].charAt(words[i - 1].length() - 1)) {
                strList.add(words[i]);
                count++;
            } else {
                break;
            }
        }

        if (count != words.length)
            answer = new int[]{count % n + 1, count / n + 1};

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"})));
    }

    /*
     * 3 / ["tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"] = 3, 3
     * 5 / ["hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"] = 0, 0
     * 2 / ["hello", "one", "even", "never", "now", "world", "draw"] = 1, 1
     * */
}
