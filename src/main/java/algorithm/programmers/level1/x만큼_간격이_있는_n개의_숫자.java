package algorithm.programmers.level1;

public class x만큼_간격이_있는_n개의_숫자 {
    /**
     * @param x = 2 / -4
     * @param n = 5 / 2
     * @return [2, 4, 6, 8, 10] / [-4, -8]
     */
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (i + 1);
        }
        return answer;
    }
}
