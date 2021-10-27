package algorithm.inflearn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _02_01_큰_수_출력하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i : solution2(n, arr)) {
            System.out.print(i + " ");
        }
    }

    /***
     *
     * @param n = 6
     * @param arr = [7 3 9 5 6 12]
     * @return [7 9 6 12]
     */
    private static List<Integer> solution(int n, int[] arr) {
        List<Integer> list = new ArrayList<>();
        int val = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (val < arr[i]) {
                list.add(arr[i]);
            }
            val = arr[i];
        }
        return list;
    }

    private static List<Integer> solution2(int n, int[] arr) {
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int i = 1; i < n; i++) {
             if (arr[i] > arr[i-1]) {
                 list.add(arr[i]);
             }
        }
        return list;
    }
}
