public class LList {
    public static void main(String[] args) {
        LinkNode node = new LinkNode(1);
        node.add(2);
        node.add(3);
        node.add(4);
        node.print();
        System.out.println();
        System.out.println("Размер списка " + node.size());
    }
}
