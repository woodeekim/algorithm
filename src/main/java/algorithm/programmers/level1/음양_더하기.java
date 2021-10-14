package algorithm.programmers.level1;

public class 음양_더하기 {
    /**
     * @param absolutes = [4,7,12]
     * @param signs = [true,false,true]
     * @return 9
     */
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        for (int i = 0; i < absolutes.length; i++) {
            sum += signs[i] ? absolutes[i] : absolutes[i] * -1;
        }
        return sum;
    }
}
