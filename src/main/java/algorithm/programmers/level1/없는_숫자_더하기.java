package algorithm.programmers.level1;

import java.util.*;

public class 없는_숫자_더하기 {
    /***
     * @param numbers = [1,2,3,4,6,7,8,0]
     * @return = 14
     */
    public static int solution(int[] numbers) {
        return 45 - Arrays.stream(numbers).sum();
    }

    public static int solution2(int[] numbers) {
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        int emptyNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (!list.contains(numbers[i])) {

            }

        }
        return 45 - Arrays.stream(numbers).sum();
    }

    public static void main(String[] args) {
        int[] numbers = {5,8,4,0,6,7,9};
        int solution = solution2(numbers);
        System.out.println("solution = " + solution);
    }
}
