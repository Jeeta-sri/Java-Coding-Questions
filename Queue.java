class Queue {
    int size;
    int front, rear;
    int[] arr;

    // Constructor to initialize queue
    Queue(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    // Function to insert element (Enqueue)
    void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue is Full (Overflow)");
        } else {
            if (front == -1) front = 0; // first element insertion
            arr[++rear] = value;
            System.out.println(value + " inserted into queue");
        }
    }

    // Display queue elements
    void display() {
        if (front == -1)
            System.out.println("Queue is Empty");
        else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
    }
}
