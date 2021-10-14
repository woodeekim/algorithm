package algorithm.programmers.level1;

public class 서울에서_김서방_찾기 {
    /**
     * @param seoul = ["Jane", "Kim"]
     * @return "김서방은 1에 있다"
     */
    public String solution(String[] seoul) {
        int index = 0;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                index = i;
            }
        }
        return String.format("김서방은 %s에 있다", index);
    }
}
