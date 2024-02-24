import java.util.*;
public class LL {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();
        list.addFirst("list");
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");
    }
}
