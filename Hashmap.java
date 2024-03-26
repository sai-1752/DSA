import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("india",120);
        map.put("china",100);
        map.put("uk",60);
        map.put("us",120);

        System.out.println(map);

        map.put("china", 190);
        System.out.println(map);

        if (map.containsKey("china")) {
            System.out.println("present");
        }
        else{
            System.out.println("not present");
        }

        System.out.println(map.get("china"));

        int arr[]={12,15,18};
        for (int i : arr) {
            System.out.println(i);
        } 
        for (Map.Entry<String,Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys=map.keySet();
        for (String key : keys) {
            System.out.println(key+" "+map.get(key));
        }

        map.remove("china");
        System.out.println(map);
    }
}
