import java.util.*;

public class Solution {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        Map<String, Integer> hMap = new HashMap<>();
        for (String str : strings) {
            hMap.put(str, hMap.getOrDefault(str, 0) + 1);
        }
        List<Integer> resultList = new ArrayList<>();

        for (String query : queries) {
            resultList.add(hMap.getOrDefault(query, 0));
        }

        return resultList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        List<String> strings = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            strings.add(sc.nextLine());
        }

        int q = Integer.parseInt(sc.nextLine());
        List<String> queries = new ArrayList<>();

        for (int j = 0; j < q; j++) {
            queries.add(sc.nextLine());
        }

        List<Integer> output = matchingStrings(strings, queries);

        for (int count : output) {
            System.out.println(count);
        }

        sc.close();
    }
}
