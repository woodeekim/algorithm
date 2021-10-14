package algorithm.programmers.level1;

public class 가운데_글자_가져오기 {
    /**
     * @param str = "abcde"
     * @return "c"
     */
    public String solution(String str) {
        int half = str.length() / 2;
        return str.length() % 2 == 0
                ? str.substring(half - 1, half + 1)
                : str.substring(half, half + 1);
    }
}
