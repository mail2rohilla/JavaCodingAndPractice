package designPatterns.decorator

abstract class DecoratorTemplate implements Decorate{

    Decorate ref;
    DecoratorTemplate(Decorate ref){
        this.ref = ref;
    }
    @Override
    void m1() {
        this.ref.m1();
    }
}
