public class stackMain {
    public static void main(String[] args) {
        // customStack stack=new customStack();
        dynamicStack stack=new dynamicStack();
        stack.push(1);  
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // System.out.println(stack.pop());
        //game of 2 stacks - hackerrank - https://www.hackerrank.com/challenges/game-of-two-stacks/problem
    }
}
