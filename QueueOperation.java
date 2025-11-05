class Queue{
    int size;
    int front, rear;
    int[] arr;

    // Constructor
    Queue (int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    // Insertion operation (Enqueue)
    void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow! Cannot insert " + value);
        } else {
            if (front == -1) front = 0; // First insertion
            arr[++rear] = value;
            System.out.println(value + " inserted into the queue.");
        }
    }

    // Deletion operation (Dequeue)
    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow! No element to delete.");
        } else {
            System.out.println(arr[front] + " deleted from the queue.");
            front++;
        }
    }

    // Peek operation (View front element)
    void peek() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty.");
        } else {
            System.out.println("Front element: " + arr[front]);
        }
    }

    // Display operation
    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty.");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    // Main method to test
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        q.dequeue();
        q.display();

        q.peek();
    }
}
