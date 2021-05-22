package linkedList

class Node<T> {
    T data;
    Node next;

    Node(T data){
        this.data = data;
    }
    Node(T data, Node next){
        this.data = data;
        this.next = next;
    }
}
