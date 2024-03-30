import java.util.*;

public class tickets {
    public static String getstart(HashMap<String,String>tick){
        HashMap<String,String> revMap=new HashMap<>();

        for (String key: tick.keySet()) {
            revMap.put(tick.get(key), key);           
        }

        for (String key : tick.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> mytickets=new HashMap<>();
        mytickets.put("chennai","banglore");
        mytickets.put("mumbai","delhi");
        mytickets.put("goa","chennai");
        mytickets.put("delhi","goa");

        String start=getstart(mytickets);

        while (mytickets.containsKey(start)) {
            System.out.print(start+"->");
            start=mytickets.get(start);
        }
        System.out.println(start);
    }

}
