import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        getOutput(productSearch(createList(),getSearch()));
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

    private static String getSearch() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product : ");
        return scanner.nextLine().trim();
    }

    public  static String productSearch(Map<String, Integer> map, String key){
        if (map.get(key) != null){ return key + " = " + map.get(key).toString();}
        else {
            return "No such a product";}
    }

    private static void getOutput(String output) {
        System.out.println("Quantity: " + output);
    }
}
