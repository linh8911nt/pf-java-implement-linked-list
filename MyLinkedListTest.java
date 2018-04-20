public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.addFirst("1");
        list.addFirst("2");
        list.addLast("6");
        list.addFirst("10");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
