package algorithm.inflearn;

import java.util.Scanner;

public class _01_11_문자열_압축 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //KKHSSSSSSSE K2HS7E
        System.out.println(solution(scanner.next()));
    }

    private static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        s = s + " ";
        int cnt = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                cnt++;
            } else {
                sb.append(s.charAt(i));
                if (cnt > 1) {
                    sb.append(cnt);
                }
                cnt = 1;
            }
        }
        return sb.toString();
    }
}
