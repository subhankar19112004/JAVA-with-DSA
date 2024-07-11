public class stackmain {
    public static void main(String[] args) throws Exception {
        customStack stack = new DynamicStack(5);


        stack.push(45);
        stack.push(29);
        stack.push(75);
        stack.push(96);


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        
    }
}
