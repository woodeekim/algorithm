package algorithm.programmers.level1;

public class 문자열_다루기_기본 {
    /**
     * @param s = "a234" / "1234"
     * @return false / true
     */
    public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) {
            return s.matches("^[0-9]*$");
        }
        return false;
    }
}
