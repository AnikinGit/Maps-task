import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Task1 {

    public static void main(String[] args) {
        getListInitial(createList());
        getEditingMap(editingMap(addElement(createList(),"plum", 15), "banana",14));
    }

    public static Map<String, Integer> createList() {
        Map<String, Integer> map = new HashMap<>();
        map.put("orange", 12);
        map.put("banana", 25);
        map.put("lemon", 8);
        map.put("pineapple", 13);
        map.put("grape", 9);
        return map;
    }

    private static Map<String, Integer> addElement(Map<String, Integer> map, String key, Integer value) {
        map.put(key, value);
        return map;
    }

    private static Map<String, Integer> editingMap(Map<String, Integer> map, String key, Integer newValue) {
        map.replace(key, newValue);
        return map;
    }
    public static void getListInitial(Map<String, Integer> map){
        AtomicInteger count = new AtomicInteger();
        System.out.println("Initial data:");
        map.forEach((key, value) -> {
            count.getAndIncrement();
            System.out.println(count + ") " + key  + ", " + value + " kg");
        });
        System.out.println("");
    }
    public static void getEditingMap(Map<String, Integer> map){
        AtomicInteger count = new AtomicInteger();
        System.out.println("Updated data:");
        map.forEach((key, value) -> {
            count.getAndIncrement();
            System.out.println(count + ") " + key + ", " +  value + " kg");
        });
    }
}
