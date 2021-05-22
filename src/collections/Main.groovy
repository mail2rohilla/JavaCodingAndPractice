package collections

class Main {


//    new Comparator<String>() {
//        @Override
//        int compare(String s1, String s2) {
//            return s1.compareTo(s2);
//        }
//    }
    public static void main(String[] args) {
        SortedMap<String, Integer> map = new TreeMap<String, Integer>();

        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(19);
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(6);

//        map.put( "qr", 1);
//        map.put("a" ,2);
//        map.put( "qf", 3);
//        map.put("b", 4);


        Collections.shuffle(list);
//        println Collections.binarySearch(list, 2);
//        list.add(-1*Collections.binarySearch(list, 7) -1, 7)
        print Collections.properties;

    }
}
