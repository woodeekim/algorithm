package algorithm.programmers.level1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class x만큼_간격이_있는_n개의_숫자Test {

    @Test
    void test() {
        long[] result = solution(4, 3);
        System.out.println(Arrays.toString(result));
        //[2,4,6,8,10]
    }

    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (i + 1);
        }
        return answer;
    }
}
