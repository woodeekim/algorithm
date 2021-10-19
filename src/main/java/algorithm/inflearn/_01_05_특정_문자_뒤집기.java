package algorithm.inflearn;

import java.util.Scanner;

public class _01_05_특정_문자_뒤집기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String iStr = scanner.nextLine();
        System.out.println(solution3(iStr));
    }

    private static String solution(String str) {
        // a#b!GE*T@S
        char[] chars = str.toCharArray();
        int lt = 0;
        int rt = chars.length - 1;

        while (lt < rt) {
            if ((65 <= chars[lt] && chars[lt] <= 122) && (65 <= chars[rt] && chars[rt] <= 122)) {
                char val = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = val;
                lt++;
                rt--;
            } else if ((65 <= chars[lt] && chars[lt] <= 122)) {
                rt--;
            } else if ((65 <= chars[rt] && chars[rt] <= 122)) {
                lt++;
            }else {
                lt++;
                rt--;
            }
        }
        return String.valueOf(chars);
    }

    private static String solution2(String str) {
        // a#b!GE*T@S
        char[] chars = str.toCharArray();
        int lt = 0;
        int rt = chars.length - 1;
        while (lt < rt) {
            boolean isLeftAlphabet = Character.isAlphabetic(chars[lt]);
            boolean isRightAlphabet = Character.isAlphabetic(chars[rt]);

            if (isLeftAlphabet && isRightAlphabet) {
                char val = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = val;
                lt++;
                rt--;
            } else if (isLeftAlphabet) {
                rt--;
            } else if (isRightAlphabet) {
                lt++;
            } else {
                lt++;
                rt--;
            }
        }
        return String.valueOf(chars);
    }

    private static String solution3(String str) {
        // a#b!GE*T@S
        char[] chars = str.toCharArray();
        int lt = 0;
        int rt = chars.length - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(chars[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(chars[rt])) {
                rt--;
            } else {
                char val = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = val;
                lt++;
                rt--;
            }
        }
        return String.valueOf(chars);
    }
}
