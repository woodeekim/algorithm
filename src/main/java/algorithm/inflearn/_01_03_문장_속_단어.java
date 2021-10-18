package algorithm.inflearn;

import java.util.Scanner;

public class _01_03_문장_속_단어 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        System.out.println(solution4(inputStr));
    }

    private static String solution(String str) {
        String[] split = str.split(" ");
        int max = 0;
        for (int i = 0; i < split.length - 1; i++) {
            if (split[i].length() < split[i+1].length()) {
                max = i+1;
            }
        }
        return split[max];
    }

    private static String solution2(String str) {
        String answer = "";
        String[] split = str.split(" ");
        int max = Integer.MIN_VALUE;
        for (String s : split) {
            if (s.length() > max) {
                max = s.length();
                answer = s;
            }
        }
        return answer;
    }

    private static String solution3(String str) {
        String[] split = str.split(" ");
        for (String s : split) {
            int startIdx = str.indexOf(s);
            int endIdx = s.length();
            String substring = str.substring(startIdx, endIdx);
        }
        return "";
    }

    private static String solution4(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE;
        int spaceIdx;
        while ((spaceIdx = str.indexOf(' ')) != -1) {
            String substring = str.substring(0, spaceIdx);
            int length = substring.length();
            if (length > max) {
                max = length;
                answer = substring;
            }
            str = str.substring(spaceIdx + 1);
        }
        if (str.length() > max) {
            answer = str;
        }
        return answer;
    }
}
