package algorithm.inflearn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _01_06_중복문자제거 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(solution2(scanner.nextLine()));
    }

    private static String solution(String str) {
        //ksekkset
        List<String> list = new ArrayList<>();
        String[] split = str.split("");
        for (String s : split) {
            if (!list.contains(s)) {
                list.add(s);
            }
        }
        return String.join("", list);
    }

    private static String solution2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == str.indexOf(str.charAt(i))) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
