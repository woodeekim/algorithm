package algorithm.programmers.level1;

import java.util.Arrays;
import java.util.Comparator;

public class 문자열_내림차순으로_배치하기 {
    /**
     * @param str = "Zbcdefg"
     * @return "gfedcbZ"
     */
    public static String solution(String str) {
        return Arrays.stream(str.split(""))
                .sorted(Comparator.reverseOrder())
                .map(String::toString)
                .reduce("", String::concat);
    }
}
