package algorithm.programmers.level1;

import java.util.Arrays;

public class 자릿수_더하기 {
    /***
     * @param n = 123
     * @return 6
     */
    public static int solution(Integer n) {
        return Arrays.stream(n.toString().split("")).mapToInt(Integer::parseInt).sum();
    }

    public static int solution2(Integer n) {
        int answer = 0;
        while (n > 0) {
            answer += n % 10;
            n /= 10;
            if (n == 0) {
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int result = solution2(123);
        System.out.println("result = " + result);
    }
}
