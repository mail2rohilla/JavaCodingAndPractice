package inheritance

import linkedList.LLUtils

class Main {

    public static void main(String[] args) {
        Child ch = new Child();
        Parent p = new Parent();
        Parent chP = new Child();

        Main m = null;
        print "${m.getClass()}"


    }
}
