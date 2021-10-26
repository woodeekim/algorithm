package algorithm.inflearn;

import java.util.Scanner;

public class _01_09_숫자만_추출 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(solution3(scanner.nextLine()));
    }

    public static int solution(String s) {
        return Integer.parseInt(s.replaceAll("[^0-9]", ""));
    }

    public static int solution2(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if (c >= '0' && c <= '9') {
                sb.append(c);
            }
        }
        return Integer.parseInt(sb.toString());
    }

    public static int solution3(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                sb.append(c);
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
