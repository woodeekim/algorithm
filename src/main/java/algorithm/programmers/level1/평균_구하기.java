package algorithm.programmers.level1;

public class 평균_구하기 {
    /**
     * @param arr = [1,2,3,4]
     * @return 2.5
     */
    public double solution(int[] arr) {
        int sum = 0;
        for (int number : arr) {
            sum += number;
        }
        return (double) sum / arr.length;
    }
}
