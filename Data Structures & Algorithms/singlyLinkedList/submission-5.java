
class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public int get(int index) {
        int n = 0;
        Node nodePointer = head;
        for(int i = 0; i <= index; i++){
            if(nodePointer == null){return -1;}
            n  = nodePointer.getPayload();
            nodePointer = nodePointer.getNext();
        }
        return n;
    }

    public void insertHead(int val) {
        Node newNode = new Node(val);
        newNode.setNext(head);
        head  = newNode;
    }

    public void insertTail(int val) {
        if(head == null){
            head  = new Node(val);
            return;
        }
        Node temp = head;
        Node newNode = new Node(val);
        while(temp.getNext() != null){
            temp  = temp.getNext();
        }
        temp.setNext(newNode);
    }

    public boolean remove(int index) {
        Node temp = head;
        Node pre = null;
        if(index == 0){
            if(head == null){
                return false;
            }else{
                head = head.getNext();
                return true;
            }
        }
        for(int i = 0; i <= index -1 ; i++){
            pre  = temp;
            temp = temp.getNext();
            if(temp == null) return false;
        }
        if(temp.getNext() == null){
            pre.setNext(null);
            return true;
        }
        pre.setNext(temp.getNext());
        return true;
        
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> list = new ArrayList<>();
        Node temp = head;
        while(temp != null){
            list.add(temp.getPayload());
            temp = temp.getNext();
        }
        return list;

    }
}

class Node{
    private int payload;
    private Node next;

    public Node(int payload){
        this.payload = payload;
        next = null;
    }
    public void setNext(Node next){this.next = next;}
    public Node getNext(){return next;}
    public int getPayload(){return payload;}
}
