package algorithm.programmers.level1;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class 완주하지_못한_선수 {
    /**
     * @param participant = {"marina", "josipa", "nikola", "vinko", "filipa"}
     * @param completion = {"josipa", "filipa", "marina", "nikola"}
     * @return "vinko"
     */
    public String solution(String[] participant, String[] completion) {
        Map<String, Long> participantMap = Arrays.stream(participant)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (String name : completion) {
            long value = participantMap.get(name) - 1L;
            if (value == 0) {
                participantMap.remove(name);
            } else {
                participantMap.put(name, value);
            }
        }
        return participantMap.keySet().iterator().next();
    }
}
