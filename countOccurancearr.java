import java.util.HashMap;
import java.util.Map;

public class countOccurancearr {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,4,5,6,7,7,7};
        Map<Integer,Integer> countMap=new HashMap<>();
        for (int num : arr) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num)+1);
            }
            else{
                countMap.put(num, 1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : countMap.entrySet()) {
            System.out.println("element"+entry.getKey()+"occurs"+entry.getValue()+"times");
        }
    }
}
