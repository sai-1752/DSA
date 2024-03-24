import java.util.Stack;

class queueusingstack{
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public queueusingstack(){
        stack1=new Stack<>();
        stack2=new Stack<>();
    }

    public void add(int x){
        stack1.push(x);
    }

    public int poll(){
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (!stack2.isEmpty()) {
            return stack2.pop();
        }
        else{
            throw new IllegalStateException("queue is empty");
        }
    }
    public int peek(){
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (!stack2.isEmpty()) {
            return stack2.peek();
        }
        else{
            throw new IllegalStateException("queue is empty");
        }
    }

    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        queueusingstack queue=new queueusingstack();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println("peek: " +queue.peek() );
        System.out.println("poll: " + queue.poll());
        System.out.println("peek after poll: "+ queue.peek());
        System.err.println("queue is empty: "+ queue.isEmpty());
    }
}