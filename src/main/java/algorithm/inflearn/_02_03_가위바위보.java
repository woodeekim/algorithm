package algorithm.inflearn;

import java.util.*;

public class _02_03_가위바위보 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] userA = new int[n];
        int[] userB = new int[n];

        for (int i = 0; i < n; i++) {
            userA[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            userB[i] = scanner.nextInt();
        }

        for (String r : solution2(n, userA, userB)) {
            System.out.println(r);
        }
    }
        /***
         *
         * @param n = 5
         * @param userA = [2 3 3 1 3]
         * @param userB = [1 1 2 2 3]
         * @return A B A B D
         */
    private static List<String> solution(int n, int[] userA, int[] userB) {
        List<String> list = new ArrayList<>();

        String _가위 = "가위";
        String _바위 = "바위";
        String _보 = "보";

        Map<Integer, String> map = new HashMap<>();
        map.put(1, _가위);
        map.put(2, _바위);
        map.put(3, _보);

        for (int i = 0; i < n; i++) {
            if (_가위.equals(map.get(userA[i]))) {
                if (_보.equals(map.get(userB[i]))) {
                    list.add("A");
                } else if (_바위.equals(map.get(userB[i]))){
                    list.add("B");
                } else {
                    list.add("D");
                }
            } else if (_바위.equals(map.get(userA[i]))) {
                if (_가위.equals(map.get(userB[i]))) {
                    list.add("A");
                } else if (_보.equals(map.get(userB[i]))) {
                    list.add("B");
                } else {
                    list.add("D");
                }
            } else {
                if (_바위.equals(map.get(userB[i]))) {
                    list.add("A");
                } else if (_가위.equals(map.get(userB[i]))) {
                    list.add("B");
                } else {
                    list.add("D");
                }
            }
        }
        return list;
    }

    private static List<String> solution2(int n, int[] userA, int[] userB) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (userA[i] == userB[i]) {
                list.add("D");
            } else if (userA[i] == 1 && userB[i] == 3) {
                list.add("A");
            } else if (userA[i] == 2 && userB[i] == 1) {
                list.add("A");
            } else if (userA[i] == 3 && userB[i] == 2) {
                list.add("A");
            } else {
                list.add("B");
            }
        }
        return list;
    }
}
