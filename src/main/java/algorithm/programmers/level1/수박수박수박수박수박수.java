package algorithm.programmers.level1;

public class 수박수박수박수박수박수 {
    /**
     * @param n = 3 / 4
     * @return "수박수" / "수박수박"
     */
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i % 2 == 1 ? "수" : "박");
        }
        return sb.toString();
    }
}
