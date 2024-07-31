import java.util.Stack;

public class paranthesis {
    public static String removeunbalanced(String expression){
        Stack<Integer> stack=new Stack<>();
        boolean[] valid=new boolean[expression.length()];

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i)=='(') {
                stack.push(i);
            }
            else if (expression.charAt(i)==')') {
                if (!stack.isEmpty()) {
                    valid[stack.pop()]=true;
                    valid[i]=true;
                }
            }
            else{
                valid[i]=true;
            }
        }

        StringBuilder result=new StringBuilder();
        for (int i = 0; i < expression.length(); i++) {
            if (valid[i]) {
                result.append(expression.charAt(i));
            }
        }
        return result.toString();
    }       
    public static void main(String[] args) {
        String input1 = "((abc)((de))";
        String input2 = "(((ab)";
        
        System.out.println("Input : " + input1);
        System.out.println("Output: " + removeunbalanced(input1));
        
        System.out.println("Input : " + input2);
        System.out.println("Output: " + removeunbalanced(input2));
    }

}
