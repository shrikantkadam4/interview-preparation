import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserAccessLogAnalyzerKaratCodeChallenge {
    public static void main(String[] args){
        String[][] badgeRecords={{"Paul","1030"},{"Jenny","1030"},{"Paul","1030"},{"Jenny","1030"},{"Paul","1030"},{"Mark","1030"}};

        System.out.println("Users with more than 2 access logs- " + findUsersWithMoreThan2AccessLogs(badgeRecords));
    }

    public static List<String> findUsersWithMoreThan2AccessLogs(String[][] badgeRecords){
        Map<String, Integer> returnRecords = new HashMap<>();

        for (String[] badgeRecord: badgeRecords){
            String userName=badgeRecord[0];
            returnRecords.put(userName, returnRecords.getOrDefault(userName,0)+1);
        }

        return returnRecords.entrySet().stream()
                .filter(entry -> entry.getValue() > 2)
                .map(Map.Entry::getKey)
                /*.map(entry -> entry.getKey())*/
                .collect(Collectors.toList());
    }
}
