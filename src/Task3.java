import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Task3 {

    public static void main(String[] args) {
        getListInitial(createMap());
        getEditingMap(editingMap(createMap(), "Tom", "tomasdev@glob.net"));
    }
    public static LinkedHashMap<String, String> createMap() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Tom", "tom@mail.com");
        linkedHashMap.put("Lisa", "lisa@mail.com");
        linkedHashMap.put("Alice", "alisa@mail.com");
        linkedHashMap.put("Denis", "den@mail.com");
        return linkedHashMap;
    }

    private static LinkedHashMap<String, String> editingMap(LinkedHashMap<String, String> map, String key, String newValue) {
        map.replace(key, newValue);
        return map;
    }
    public static void getListInitial(LinkedHashMap<String, String> map){
        AtomicInteger count = new AtomicInteger();
        System.out.println("Initial data:");
        map.forEach((key, value) -> {
            count.getAndIncrement();
            System.out.println(count + ") " + key  + " - " + value);
        });
        System.out.println("");
    }
    public static void getEditingMap(LinkedHashMap<String, String> map){
        AtomicInteger count = new AtomicInteger();
        System.out.println("Updated contacts:");
        map.forEach((key, value) -> {
            count.getAndIncrement();
            System.out.println(count + ") " + key + " - " +  value);
        });
    }
}
