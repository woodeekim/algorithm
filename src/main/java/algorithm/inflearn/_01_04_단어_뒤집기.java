package algorithm.inflearn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _01_04_단어_뒤집기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int iNum = scanner.nextInt();
        String[] sArray = new String[iNum];

        for (int i = 0; i < sArray.length; i++) {
            sArray[i] = scanner.next();
        }
        for (String s : solution3(sArray)) {
            System.out.println(s);
        }
    }

    public static List<String> solution(String[] array) {
        List<String> list = new ArrayList<>();
        for (String s : array) {
            String[] split = s.split("");
            StringBuilder sb = new StringBuilder();
            for (int i = split.length - 1; i >= 0; i--) {
                sb.append(split[i]);
            }
            list.add(sb.toString());
        }
        return list;
    }

    public static List<String> solution2(String[] array) {
        List<String> list = new ArrayList<>();
        for (String s : array) {
            list.add(new StringBuilder(s).reverse().toString());
        }
        return list;
    }

    public static List<String> solution3(String[] array) {
        List<String> list = new ArrayList<>();
        for (String s : array) {
            char[] chars = s.toCharArray();
            int lt = 0;
            int rt = chars.length - 1;
            while (lt < rt) {
                char val = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = val;
                lt++;
                rt--;
            }
            list.add(String.valueOf(chars));
        }
        return list;
    }
}
