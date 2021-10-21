package algorithm.inflearn;

import java.util.Scanner;

public class _01_08_유효한_팰린드롬 {
    public static void main(String[] args) {
        //found7, time: study; Yduts; emit, 7Dnuof
        Scanner scanner = new Scanner(System.in);
        System.out.println(solution2(scanner.nextLine()));
    }

    private static String solution(String s) {
        s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        char[] chars = s.toCharArray();
        int len = chars.length;
        for (int i = 0; i < len / 2; i++) {
            if (chars[i] != chars[len -i -1]) {
                return "NO";
            }
        }
        return "YES";
    }

    private static String solution2(String s) {
        s = s.replaceAll("[^a-zA-Z]", "");
        String reverse = new StringBuilder(s).reverse().toString();
        if (s.equalsIgnoreCase(reverse)) {
            return "YES";
        } else {
            return "NO";
        }
    }

}
