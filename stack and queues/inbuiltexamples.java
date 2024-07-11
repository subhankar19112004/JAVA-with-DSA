import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class inbuiltexamples{
    public static void main(String[] args) {

        //Stack
        Stack <Integer> stack = new Stack<>();
        stack.push(45);
        stack.push(29);
        stack.push(75);
        stack.push(96);

      /* System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());*/
        
        //Queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(19);       
        queue.add(56);       
        queue.add(45);       
        queue.add(64);    
        
        
        /*System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());*/


        
    }
}