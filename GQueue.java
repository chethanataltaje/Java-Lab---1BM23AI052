import java.util.Arrays;

public class GQueue<T>{
    private T[] que;
    private int size;

    @SuppressWarnings("unchecked")
    public GQueue(){
        que=(T[]) new Object[2];
        size=0;
    }
    public void enqueue(T element){
        if (size==que.length){
            int newCapacity=que.length*2;
            que=Arrays.copyOf(que, newCapacity);
        }
        que[size++]=element;

    }
    public T dequeue(){
        if (size==0){
            System.out.println("Empty Queue");
            return null;
        }
        T deletedElement=que[0];
        System.arraycopy(que,1,que,0,size-1);
        que[--size]=null;
        return deletedElement;
    }
    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Queue contents:");
        for (int i = 0; i < size; i++) {
            System.out.print(que[i] + " ");
        }
        System.out.println();


    }
    public int getSize(){
        return size;
    }

    public static void main (String[] args){
        GQueue<Integer> integerQueue=new GQueue<>();
        integerQueue.enqueue(10);
        integerQueue.enqueue(20);
        integerQueue.enqueue(30);
        integerQueue.display();
        Integer dequeuedElement = integerQueue.dequeue();
        System.out.println("Dequeued element: " + dequeuedElement);
        integerQueue.display();
        System.out.println("Queue size: " + integerQueue.getSize());

    }

}


