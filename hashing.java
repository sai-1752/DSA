import java.util.*;
public class hashing {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        System.out.println(set);

        if (set.contains(1)) {
            System.out.println("set contains 1");
        }
        if(!set.contains(5)){
            System.out.println("set doesnt contains");
        }

        set.remove(1);
        if (!set.contains(1)) {
            System.out.println(set);
        }

        System.out.println("size of the set is "+ set.size());

        Iterator it=set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
