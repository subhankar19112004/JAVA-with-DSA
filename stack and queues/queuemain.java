public class queuemain {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(3);
        queue.insert(33);
        queue.insert(333);
        queue.insert(3333);
        queue.insert(33333);

        queue.display();
    }
}
