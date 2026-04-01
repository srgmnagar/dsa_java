public class customQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 3;
    int end = 0;

    public customQueue() {
        this(DEFAULT_SIZE);
    }

    public customQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int item) {
        // O(1)
        if (isFull()) {
            System.out.println("queue is full");
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove() {
        // O(N)
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }
        int removed = data[0];
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end--;
        return removed;
    }

        public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " ");
        }
    }
}