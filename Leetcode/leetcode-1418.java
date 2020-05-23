import java.util.*;

class Solution {
    public List<List<String>> displayTable(List<List<String>> orders) {
        Map<Integer, Map<String, Integer>> tables = new TreeMap<>();
        Set<String> foodsList = new TreeSet<>();
        List<List<String>> result = new ArrayList<>();
        List<String> headers = new ArrayList<>();
        headers.add("Table");

        for (List<String> order : orders) {
            int table = Integer.parseInt(order.get(1));
            String food = order.get(2);

            foodsList.add(food);
            tables.putIfAbsent(table, new HashMap<>());

            Map<String, Integer> foundTable = tables.get(table);
            foundTable.put(food, foundTable.getOrDefault(food, 0) + 1);
        }

        headers.addAll(foodsList);
        result.add(headers);

        for (int tableNo : tables.keySet()) {
            List<String> foodCount = new ArrayList<>();
            foodCount.add(String.valueOf(tableNo)); // first value foodcount should be table no
            Map<String, Integer> foods = tables.get(tableNo);

            for (String foodItem : foodsList) {
                String count = String.valueOf(foods.getOrDefault(foodItem, 0));
                foodCount.add(count);
            }

            result.add(foodCount);
        }

        return result;
    }
}