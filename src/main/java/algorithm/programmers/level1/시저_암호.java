package algorithm.programmers.level1;

public class 시저_암호 {
    /**
     * @param s = "AB"
     * @param n = 1
     * @return "BC"
     */
    public static String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int sumAsciiNum = c + n;
            if (Character.isUpperCase(c)) {
                if (90 < sumAsciiNum) {
                    sb.append((char) ((sumAsciiNum - 'A') % 26 + 'A'));
                } else {
                    sb.append((char) sumAsciiNum);
                }
            } else if (Character.isLowerCase(c)) {
                if (122 < sumAsciiNum) {
                    sb.append((char) ((sumAsciiNum - 'a') % 26 + 'a'));
                } else {
                    sb.append((char)sumAsciiNum);
                }
            } else {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String solution = solution("Z", 3);
        //ZzYy
        System.err.println("solution = " + solution);
    }
}

