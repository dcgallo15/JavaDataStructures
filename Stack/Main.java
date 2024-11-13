class Main {
    public static void main(String args[]) {
        System.out.println("HelloWorld!");
        Stack<Integer> stack = new Stack<Integer>(5);
        stack.push(5);
        stack.push(10);
        stack.push(14);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
