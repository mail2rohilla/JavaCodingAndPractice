package linkedList

class LLUtils<T> {

    public Node make(ArrayList<T> arr){
        Node head = null;
        Node temp = null;
        for(T data : arr){
            Node<?> node = new Node(data);
            if(head == null){
                head = node;
                temp = node;
            }else{
                temp.next = node;
                temp = node;
            }
        }

        return head;
    }

    static Node print(Node node){
        Node temp = node;
        while(temp != null){
            if(temp.next != null)
                print "${temp.data} -> "
            else
                print "${temp.data} "

            temp = temp.next;
        }

    }
}
