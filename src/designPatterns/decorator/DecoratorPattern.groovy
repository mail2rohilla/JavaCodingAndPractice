package designPatterns.decorator

class DecoratorPattern extends DecoratorTemplate{

    DecoratorPattern(Decorate ref) {
        super(ref)
    }

    @Override
    void m1() {
        super.m1()
        println "decorating class with additional functionality"
    }
}
