package algorithm.inflearn;

import java.util.Scanner;

public class _01_09_숫자만_추출 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(solution(scanner.nextLine()));
    }

    public static int solution(String s) {
        return Integer.parseInt(s.replaceAll("[^0-9]", ""));
    }
}
