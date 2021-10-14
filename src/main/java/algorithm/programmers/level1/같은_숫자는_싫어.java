package algorithm.programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class 같은_숫자는_싫어 {
    /**
     * @param arr = [1,1,3,3,0,1,1]
     * @return [1, 3, 0, 1]
     */
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        int num = 10;
        for (int element : arr) {
            if (num != element) {
                list.add(element);
            }
            num = element;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
