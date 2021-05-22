package linkedList

class REverseLLinGroups {

    public  Node reverse(Node node, int k)
    {
        if(k <= 1)
            return node;

        return helper(node, null, k);

    }

    private  Node helper(Node s, Node p, int k){
        int i = k-1;
        Node t = s;

        while(i > 0 && t.next != null){
            t = t.next;
            i--;
        }

        if(t.next == null){
            rev(s)
            return t;
        }

        Node next = t.next;
        t.next = null;
        Node v = helper(next, t, k);

        rev(s)
        s.next = v;

        return t;
    }


    public  Node rev(Node n){
        Stack<Node> stack = new Stack<>();

        Node t = n;
        while(t != null){
            stack.push(t);
            Node node = t.next;
            t.next = null;
            t = node;
        }
        Node head = null;
        t = null;
        while(stack.size() > 0){
            if (head == null) {
                head = stack.pop()
                t = head;
            }else{
                t.next = stack.pop();
                t = t.next;
            }
        }

        return head
    }
}
