import java.util.*;
class Solution {
 public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, Set<String>> reportMap = new HashMap<>();
        Map<String, List<String>> reportedMap = new HashMap<>();
        Map<String, Integer> resultMap = new LinkedHashMap<>();
        for (String id : id_list) {
            reportMap.put(id, new HashSet<>());
            reportedMap.put(id, new ArrayList<>());
            resultMap.put(id, 0);
        }

        for (String re : report) {
            String[] splitReport = re.split(" ");
            String reportUser = splitReport[0];
            String reportedUser = splitReport[1];
            Set<String> reportMapValue = reportMap.get(reportUser);
            reportMapValue.add(reportedUser);
            reportMap.put(reportUser, reportMapValue);
        }

        for (String reportMapKey : reportMap.keySet()) {
            Set<String> reportMapValue = reportMap.get(reportMapKey);
            for (String reportValue : reportMapValue) {
                List<String> reportedMapValue = reportedMap.get(reportValue);
                reportedMapValue.add(reportMapKey);
                reportedMap.put(reportValue, reportedMapValue);
            }
        }

        for (String resultMapKey : resultMap.keySet()) {
            List<String> reportedMapValue = reportedMap.get(resultMapKey);
            if (reportedMapValue.size() >= k) {
                for (String rep : reportedMapValue) {
                    resultMap.put(rep, resultMap.get(rep) + 1);
                }
            }
        }

        int count = 0;
        for (Integer value : resultMap.values()) {
            answer[count] = value;
            count++;
        }

        return answer;
    }
}