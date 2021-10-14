package algorithm.programmers.level1;

public class 핸드폰_번호_가리기 {
    /**
     * @param phoneNumber = "01033334444"
     * @return "*******4444"
     */
    public String solution(String phoneNumber) {
        char[] chars = phoneNumber.toCharArray();
        for (int i = 0; i < chars.length - 4; i++) {
            chars[i] = "*".charAt(0);
        }
        return String.valueOf(chars);
    }
}
