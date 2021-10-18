package algorithm.inflearn;

import java.util.Arrays;
import java.util.Scanner;

public class _01_01_문자_찾기 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        String inputChar = scanner.next();
        int solution = solution(inputString, inputChar);
        System.out.println(solution);
    }

    private static int solution(String inputString, String inputChar) {
        int cnt = 0;
        for (String str : inputString.toLowerCase().split("")) {
            if (inputChar.toLowerCase().equals(str)) {
                cnt += 1;
            }
        }
        return cnt;
    }

    private static int solution2(String inputString, String inputChar) {
        return (int) Arrays.stream(inputString.toLowerCase().split("")).filter(inputChar.toLowerCase()::equals).count();
    }
}
