public class customStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public customStack(){
        this(DEFAULT_SIZE);
    }
    public customStack(int size){
        this.data = new int[size];

    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("STACK IS FULL_ _ _ _");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public int pop() throws StackException {
        if(isEmpty()){
            throw new StackException("cannot pop from an empty stack_ _ _");

        }
        return data[ptr--];
    }
     public int peek() throws StackException {
            if (isEmpty()) {
                throw new StackException("Cannot peek from an empty stack!!");
            }
            return data[ptr];
        }
    
        public boolean isFull() {
            return ptr == data.length - 1; // ptr is at last index
        }
    
        public boolean isEmpty() {
            return ptr == -1;
        }

    
}
