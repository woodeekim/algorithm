package algorithm.inflearn;

import java.util.Scanner;

public class _01_12_암호 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //4
        //#****###**#####**#####**##**
        System.out.println(solution2(scanner.nextInt(), scanner.next()));
    }

    private static String solution(int n, String s) {
        s = s.replaceAll("[#]", "1").replaceAll("[*]", "0");
        StringBuilder sb = new StringBuilder();

        int beginIdx = 0;
        int endIdx = 7;
        for (int i = 0; i < n; i++) {
            String binaryString = s.substring(beginIdx, endIdx);
            beginIdx += 7;
            endIdx += 7;

            int decimal = Integer.parseInt(binaryString, 2);
            sb.append((char) decimal);
        }
        return sb.toString();
    }

    private static String solution2(int n, String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String binaryString = s.substring(0, 7).replace('#', '1').replace('*', '0');
            int decimal = Integer.parseInt(binaryString, 2);
            sb.append((char) decimal);

            s = s.substring(7);
        }
        return sb.toString();
    }
}
