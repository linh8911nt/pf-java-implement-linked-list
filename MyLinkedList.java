public class MyLinkedList<E> implements LinkedList{
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public MyLinkedList() {
    }

    @Override
    public void add(int index, Object element) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    @Override
    public void addFirst(Object o) {
        Node temp = head;
        head = new Node(o);
        head.next = temp;
        numNodes++;
    }

    @Override
    public void addLast(Object o) {
        Node temp = head;
        Node holder;
        while (temp.next != null){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(o);
        temp.next.next = holder;
        numNodes++;
    }

    @Override
    public Object remove(int index) {
        Node temp = head;
        int i = 0;
        while (temp != null && i < index){
            temp = temp.next;
            i++;
        }
        while (temp.next != null && i == index){
            temp.data = temp.next.data;
        }
        return (E) temp;
    }

    @Override
    public boolean remove(Object e) {
        return false;
    }

    @Override
    public int size() {
        Node temp = head;
        int size = 1;
        while (temp.next != null){
            size++;
            temp = temp.next;
        }
        return size;
    }

    @Override
    public Object clone() {
        return null;
    }

    @Override
    public boolean contains(Object o) {
        boolean isContains = false;
        Node temp = head;

        while (temp.next != null){
            if (o == temp.data){
                isContains = true;
                break;
            }
            temp = temp.next;
        }
        return isContains;
    }

    @Override
    public int indexOf(Object o) {
        Node temp = head;
        int index = 0;

        while (temp != null){
            if (o != temp.data){
                index++;
                temp = temp.next;
            } else
                return index;
        }
        return index;
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public void ensureCapacity(int minCapacity) {

    }

    @Override
    public Object get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++){
            temp = temp.next;
        }
        return (E) temp;
    }

    @Override
    public Object getFirst() {
        return (E) head;
    }

    @Override
    public Object getLast() {
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        return (E) temp;
    }

    @Override
    public void clear() {
        Node temp = head;
        while (temp != null){
            temp.data = null;
            temp = temp.next;
        }
    }

    public class Node{
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData(){
            return this.data;
        }
    }
}
