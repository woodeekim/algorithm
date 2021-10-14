package algorithm.programmers.level1;

public class 이상한_문자_만들기 {
    /***
     * 0포함 짝수는 대문자 홀수는 소문자
     * @param s = "try hello world"
     * @return "TrY HeLlO WoRlD"
     */
    public static String solution(String s) {
        StringBuilder builder = new StringBuilder();
        String[] split = s.split("");
        int cnt = 0;
        for (String str : split) {
            cnt = str.contains(" ") ? 0 : cnt + 1;
            builder.append(cnt % 2 == 0 ? str.toLowerCase() : str.toUpperCase());
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String result = solution("try hello world");
        System.out.println("result = " + result);
    }
}
