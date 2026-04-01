public class circularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 3;
    int end = 0, front = 0;
    private int size = 0;
    public circularQueue() {
        this(DEFAULT_SIZE);
    }

    public circularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {
        // O(1)
        if (isFull()) {
            System.out.println("queue is full");
            return false;
        }
        data[end++] = item;
        size++;
        end=end%data.length;
        return true;
    }

    public int remove() {
        // O(1)
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }
        int removed = data[front];
        front = (front + 1) % data.length;
        size--;
        return removed;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return;
        }
        for (int i = 0; i < size; i++) {
            int index = (front + i) % data.length;
            System.out.print(data[index] + " ");
        }
        System.out.println();
    }
}
