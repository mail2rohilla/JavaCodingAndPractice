package linkedList

import arrays.Utility

import java.time.Duration
import java.time.LocalDate

class Main {
    public static void main(String[] args) {
//        testReverseGroups();
//        testAddNumbers();

//        PriorityQueue<Integer> pq = new PriorityQueue<>(5);
//        println "${deparamQuery("id=607db5dc2d0e832b5f0aa568&nonceToken=TBSRFCFEVDKQUG2")}";
//
//        ArrayList<Integer> list = new ArrayList<>();
//
        new Main().testReverseGroups();

//        print LocalDate.parse("2014-11-11")

//        println list.clone();
    }

    void testReverseGroups(){
//        print Utility.getParsedIntArray("1 2 2 4 5 6 7 8" , " ")
        int[] arr = Utility.getParsedIntArray("1 2 3 4 5 6 7 8" , " ");
//        print "deepu ${arr}"
        Node head = LLUtils.make(Utility.getParsedIntArray("1 2 3 4 5 6 7 8" , " "))
        Node retval = new REverseLLinGroups().reverse(head, 3)

        LLUtils.print(retval);
    }
    void testAddNumbers(){
//        print Utility.getParsedIntArray("1 2 2 4 5 6 7 8" , " ")
        Node f = LLUtils.make(Utility.getParsedIntArray("1 2" , " "))
        Node s = LLUtils.make(Utility.getParsedIntArray("1 2" , " "))
        Node retval = new AddNmbers().addTwoLists(f,s);

        LLUtils.print(retval);
    }



    public static def deparamQuery(String queryParams) throws UnsupportedEncodingException {
        final Map query_pairs = [:];
        final String[] pairs = queryParams.split("&");
        for (String pair : pairs) {
            final int idx = pair.indexOf("=");
            final String key = idx > 0 ? URLDecoder.decode(pair.substring(0, idx), "UTF-8") : pair;
            final String value = idx > 0 && pair.length() > idx + 1 ? URLDecoder.decode(pair.substring(idx + 1), "UTF-8") : null;

            if (query_pairs.containsKey(key)) {

                def val = query_pairs.get(key);
                if(val instanceof String){
                    LinkedList list = new LinkedList<String>()
                    list.add(val);
                    list.add(value);
                    query_pairs.put(key, list);
                }else if(val instanceof List){
                    val.add(value)
                }
            }else{
                query_pairs.put(key, value);
            }
        }
        return query_pairs;
    }
}
