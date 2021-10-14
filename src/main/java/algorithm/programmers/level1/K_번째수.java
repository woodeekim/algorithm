package algorithm.programmers.level1;

import java.util.Arrays;

public class K_번째수 {
    /**
     * @param array = [1, 5, 2, 6, 3, 7, 4]
     * @param commands = [[2, 5, 3], [4, 4, 1], [1, 7, 3]]
     * @return [5, 6, 3]
     */
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int to = commands[i][0] - 1;
            int from = commands[i][1];
            int pick = commands[i][2] - 1;

            int[] splitArray = Arrays.copyOfRange(array, to, from);
            Arrays.sort(splitArray);
            answer[i] = splitArray[pick];
        }
        return answer;
    }
}
