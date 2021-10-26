package algorithm.inflearn;

import java.util.Arrays;
import java.util.Scanner;

public class _01_10_가장_짧은_문자거리 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //teachermode e
        for (int i : solution2(scanner.next(), scanner.next().charAt(0))) {
            System.out.print(i + " ");
        }

    }

    private static int[] solution(String s, char c) {
        int[] arr = new int[s.length()];
        int val = 999;
        for (int i = 0; i < s.length(); i++) {
             if (s.charAt(i) == c) {
                 val = 0;
             } else {
                 val++;
             }
            arr[i] = val;
        }
        val = 999;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                val = 0;
            }
            if (val < arr[i]) {
                arr[i] = val;
            }
            val++;
        }
        return arr;
    }

    private static int[] solution2(String s, char c) {
        int[] arr = new int[s.length()];
        int val = 999;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                val = 0;
            } else {
                val++;
            }
            arr[i] = val;
        }
        val = 999;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                val = 0;
            } else {
                val++;
                arr[i] = Math.min(arr[i], val);
            }
        }
        return arr;
    }
}
