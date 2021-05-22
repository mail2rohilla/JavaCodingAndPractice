package linkedList

class AddNmbers {
    Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        int l1 = 0, l2 = 0;
        Node f1 = first, f2 = second;
        while(f1!=null){
            l1++;
            f1 = f1.next;
        }
        while(f2!=null){
            l2++;
            f2 = f2.next;
        }

        System.out.println("diffis " + (l1-l2));

        if(l1 >= l2){
            int value = addTwoListsHelper(first, second, l1-l2);

            if(value > 0){
                Node retval = new Node(value);
                retval.next= first;
                return retval;
            }

            return first;
        }else{
            int value = addTwoListsHelper(second, first, l2-l1);
            if(value > 0){
                Node retval = new Node(value);
                retval.next= second;
                return retval;
            }
            return second;
        }
    }

    int addTwoListsHelper(Node first, Node second, int diff){
        int retval = 0;

        if(first == null && second == null){
            return 0;
        }

        if(diff > 0){
            retval += addTwoListsHelper(first.next, second, diff-1) + first.data;
            first.data = retval %10;
            return retval/10;
        }else{
            retval += addTwoListsHelper(first.next, second.next, diff) + first.data + second.data;
            first.data = retval %10;
            return retval/10;
        }

    }
}
