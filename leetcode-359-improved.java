import java.util.*;

class Pair<U, V> {
    public U first;
    public V second;

    public Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }
}

class Logger {
    /** Initialize your data structure here. */
    private LinkedList<Pair<String, Integer>> msgQueue;
    private HashSet<String> msgSet;

    public Logger() {
        msgQueue = new LinkedList<>();
        msgSet = new HashSet<>();
    }

    /**
     * Returns true if the message should be printed in the given timestamp,
     * otherwise returns false. If this method returns false, the message will not
     * be printed. The timestamp is in seconds granularity.
     */
    public boolean shouldPrintMessage(int timestamp, String message) {
        // clean up
        while (msgQueue.size() > 0) {
            Pair<String, Integer> head = msgQueue.getFirst();
            if (timestamp - head.second >= 10) {
                msgQueue.removeFirst();
                msgSet.remove(head.first);
            } else
                break;
        }

        // check if there is duplicate and print message if not
        if (!msgSet.contains(message)) {
            Pair<String, Integer> pair = new Pair(message, timestamp);
            msgQueue.addLast(pair);
            msgSet.add(message);
            return true;
        } else
            return false;
    }
}