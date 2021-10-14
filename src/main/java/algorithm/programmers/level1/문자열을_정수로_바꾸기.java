package algorithm.programmers.level1;

public class 문자열을_정수로_바꾸기 {
    public static int solution(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        int result = solution("-1234");
        System.out.println("result = " + result);
    }
}
