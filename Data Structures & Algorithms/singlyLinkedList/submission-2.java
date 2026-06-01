
class LinkedList {
    private Node head;
    private Node tail; // Track tail for O(1) tail insertion
    private int size;  // Track size for O(1) boundary checks

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) return -1; // Fast failure
        
        Node nodePointer = head;
        for (int i = 0; i < index; i++) {
            nodePointer = nodePointer.getNext();
        }
        return nodePointer.getPayload();
    }

    public void insertHead(int val) {
        Node newNode = new Node(val);
        newNode.setNext(head);
        head = newNode;
        if (tail == null) { // First element added
            tail = newNode;
        }
        size++;
    }

    public void insertTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode); // Direct access, no while loop
            tail = newNode;
        }
        size++;
    }

    public boolean remove(int index) {
        if (index < 0 || index >= size) return false; // Fast boundary check

        if (index == 0) {
            head = head.getNext();
            if (head == null) tail = null; // List became empty
            size--;
            return true;
        }

        Node pre = head;
        for (int i = 0; i < index - 1; i++) {
            pre = pre.getNext();
        }
        
        Node target = pre.getNext();
        pre.setNext(target.getNext());
        
        if (target == tail) { // If we removed the tail, update tail pointer
            tail = pre;
        }
        
        size--;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> list = new ArrayList<>(size); // Pre-allocate memory
        Node temp = head;
        while (temp != null) {
            list.add(temp.getPayload());
            temp = temp.getNext();
        }
        return list; // Removed dead array-copying code
    }
}

class Node {
    private int payload;
    private Node next;

    public Node(int payload) {
        this.payload = payload;
        next = null;
    }
    public void setNext(Node next) { this.next = next; }
    public Node getNext() { return next; }
    public int getPayload() { return payload; }
}
