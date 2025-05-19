interface Stack{
    void push(int element);
    int pop();
    boolean isEmpty();
    int size();
}
class FixedLengthStack implements Stack{
    private int[] stackArray;
    private int top;
    private int capacity;

    public FixedLengthStack(int capacity){
        this.capacity=capacity;
        this.top=-1;
        this.stackArray=new int[capacity];
    }

    public void push(int element) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow: Cannot push element, stack is full.");
            return;
        }
        stackArray[++top] = element;
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow: Cannot pop element, stack is empty.");
            return -1;
        }
        return stackArray[top--];
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public int size() {
        return top + 1;
    }
}

class DynamicLengthStack implements Stack {
    private int[] stackArray;
    private int top;
    private int capacity;

    public DynamicLengthStack() {
        this.capacity = 5; // initial size
        this.stackArray = new int[capacity];
        this.top = -1;
    }
    public void push(int element){
        if (top==capacity-1){
            capacity*=2;
            int[] newStack= new int[capacity];
            System.arraycopy(stackArray,0,newStack,0, stackArray.length);
            stackArray=newStack;
        }
        stackArray[++top]=element;
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow: Cannot pop element, stack is empty.");
            return -1;
        }
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}

public class StackOperations{
    public static void main(String[] args){
        Stack fixed= new FixedLengthStack(3);
        System.out.println("=== Fixed Length Stack ===");
        performStackOperations(fixed);

        Stack dynamic = new DynamicLengthStack();
        System.out.println("\n=== Dynamic Length Stack ===");
        performStackOperations(dynamic);
    }
    public static void performStackOperations(Stack stack) {
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40); // May overflow or grow depending on implementation

        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Is Empty: " + stack.isEmpty());
        System.out.println("Size: " + stack.size());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop()); // Should show underflow
        System.out.println("Is Empty: " + stack.isEmpty());
    }
}
