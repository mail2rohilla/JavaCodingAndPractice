package designPatterns.decorator

class DirectDecorator implements Decorate{

    Decorate ref;
    DirectDecorator(Decorate ref){
        this.ref = ref;
    }
    @Override
    void m1() {
        ref.m1();
        println("inside direct decorator");
    }
}
