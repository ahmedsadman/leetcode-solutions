import java.util.HashMap;
import java.util.Random;

class RandomizedSet {
    /*
     * An arraylist for items. To delete, swap the index item with the last one and
     * pop the last item O (1)
     * 
     * An hashmap to keep track of (element, index) of the array. Access/insert time
     * O (1)
     */
    private HashMap<Integer, Integer> map;
    private List<Integer> items;
    private Random rand;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        map = new HashMap<>(); // element, idx
        items = new ArrayList<>();
        rand = new Random();
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain
     * the specified element.
     */
    public boolean insert(int val) {
        if (map.containsKey(val))
            return false;

        map.put(val, items.size());
        items.add(val);
        return true;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified
     * element.
     */
    public boolean remove(int val) {
        if (!map.containsKey(val))
            return false;
        int idx = map.get(val);
        int lastElement = items.get(items.size() - 1);
        // move the last element to the place of deletion index
        items.set(idx, lastElement);
        map.put(lastElement, idx);

        // now delete last element
        items.remove(items.size() - 1);

        map.remove(val);

        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return items.get(rand.nextInt(items.size()));
    }
}