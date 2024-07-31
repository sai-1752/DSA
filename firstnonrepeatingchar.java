import java.util.*;

public class firstnonrepeatingchar {
    public static String repeat(String A){
        StringBuilder result=new StringBuilder();
        Queue<Character> queue=new LinkedList<>();
        Map<Character,Integer> charcount=new HashMap<>();

        for (char c : A.toCharArray()) {
            charcount.put(c,charcount.getOrDefault(c, 0)+1);
            queue.add(c);

            while (!queue.isEmpty() && charcount.get(queue.peek())>1) {
                queue.poll();
            }
    
            if (queue.isEmpty()) {
                result.append('*');
            }
            else{
                result.append(queue.peek());
            }
        }
        return result.toString();
        
    }

    public static void main(String[] args) {
        String A = "zz";
        System.out.println(repeat(A));
    }

}
