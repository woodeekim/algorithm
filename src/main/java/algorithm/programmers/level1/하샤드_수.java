package algorithm.programmers.level1;

public class 하샤드_수 {
    /**
     * @param x = 10 / 12 / 11 / 13
     * @return true / true / false / false
     */
    public boolean solution(int x) {
        String[] split = String.valueOf(x).split("");
        int sum = 0;
        for (String s : split) {
            sum += Integer.parseInt(s);
        }
        return x % sum == 0;
    }
}
