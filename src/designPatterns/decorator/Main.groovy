package designPatterns.decorator

class Main {

    public static void main(String[] args) {
        Test test = new Test();
//        DecoratorPattern decoratorTest = new DecoratorPattern(test);
        DirectDecorator directDecorator = new DirectDecorator(test);
        DecoratorPattern decoratorTest2 = new DecoratorPattern(directDecorator);

        decoratorTest2.m1();
    }
}
