public class Node {
    int value;
    Node next;

    Node(int value, Node next){
        this.value = value;
        this.next = next;
    }
}

class LinkNode{
    private Node head;
    private Node tail;

    //создаем первый элемент
    public LinkNode(int data){
        this.head = new Node(data, null);
        this.tail = head;
    }

    //добавляем элемент
    public void add(int data){
        Node temp = new Node(data, null);
        tail.next = temp;
        tail = tail.next;
    }

    //подсчет элеиентов
    public int size(){
        int count = 0;
        Node ref = head;
        while (ref != null){
            count++;
            ref = ref.next;
        }
        return count;
    }

    //вывод односвязного списка
    public void print(){
        Node ref = head;
        while (ref != null){
            System.out.printf("%d ", ref.value);
            ref = ref.next;
        }
    }
}

