import java.util.HashMap;
import java.util.Map;

public class HashMapPractice{

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        // put
        map.put("apple", 10);
        map.put("banana", 20);

        // get
        System.out.println(map.get("apple"));

        // containsKey
        System.out.println(map.containsKey("banana"));

        // replace
        map.replace("apple", 50);

        // getOrDefault
        System.out.println(map.getOrDefault("orange", 0));

        // iterate
        for(Map.Entry<String, Integer> e : map.entrySet()){

            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        // remove
        map.remove("banana");

        System.out.println(map);

        // size
        System.out.println(map.size());

        // clear
        map.clear();

        System.out.println(map.isEmpty());
    }
}