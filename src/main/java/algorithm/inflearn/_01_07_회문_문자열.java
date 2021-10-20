package algorithm.inflearn;

import java.util.Scanner;

public class _01_07_회문_문자열 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(solution(scanner.next()));
    }

    private static String solution(String str) {
        //gooG
        String[] split = str.split("");
        int lt = 0;
        int rt = split.length - 1;
        while (lt < rt) {
            if (!split[lt].equalsIgnoreCase(split[rt])) {
                return "NO";
            } else {
                lt++;
                rt--;
            }
        }
        return "YES";
    }

    private static String solution2(String str) {
        str = str.toUpperCase();
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len -i -1)) {
                return "NO";
            }
        }
        return "YES";
    }

    private static String solution3(String str) {
        String reverse = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(reverse)) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
