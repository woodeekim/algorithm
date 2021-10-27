package algorithm.inflearn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _02_02_보이는_학생 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(solution3(n, arr));
    }

    /***
     *
     * @param n = 8
     * @param arr = [130 135 148 140 145 150 150 153]
     * @return 5
     */
    private static int solution(int n, int[] arr) {
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if (arr[i] >= arr[i-1] && max < arr[i]) {
                list.add(arr[i]);
                max = arr[i];
            }

        }
        System.err.println(list);
        return 0;
    }

    private static int solution2(int n, int[] arr) {
        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                list.add(arr[i]);
                max = arr[i];
            }
        }
        return list.size();
    }
    private static int solution3(int n, int[] arr) {
        int cnt = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                cnt++;
                max = arr[i];
            }
        }
        return cnt;
    }
}
