import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.StampedLock;

public class StampedLockDemo {

    static Map<String, Integer> data = new HashMap<>();
    static StampedLock lock = new StampedLock();

    // Method to read data from the Map.
    public static Integer readDataFromMap(String key) {

        long stamp = lock.readLock();
        System.out.println("--stamp--"+stamp);
        try {
            return data.get(key);
        } finally {
            lock.unlockRead(stamp);
        }
    }

    // Method to write data to the Map.
    public static void writeDataToMap(String key, Integer value) {
        long stamp = lock.writeLock();
        try {
            data.put(key, value);
        } finally {
            lock.unlockWrite(stamp);
        }
    }

    public static void main(String args[]){
        writeDataToMap("ray", 123);
        Integer val = readDataFromMap("ray");
        System.out.println(val);
    }
}