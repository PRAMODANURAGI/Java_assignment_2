   //  Question 18  //

interface Interface1 {
    void method1();
    void method2();
}
interface Interface2 {
    void method3();
    void method4();
}
interface Interface3 {
    void method5();
    void method6();
}

interface CombinedInterface extends Interface1, Interface2, Interface3 {
    void method7();
}

class ConcreteClass {
    // Concrete class implementation
}

class ImplementationClass extends ConcreteClass implements CombinedInterface {
    @Override
    public void method1() {
        System.out.println("Interface1 method1");
    }
    @Override
    public void method2() {
        System.out.println("Interface1 method2");
    }
    @Override
    public void method3() {
        System.out.println("Interface2 method3");
    }
    @Override
    public void method4() {
        System.out.println("Interface2 method4");
    }
    @Override
    public void method5() {
        System.out.println("Interface3 method5");
    }
    @Override
    public void method6() {
        System.out.println("Interface3 method6");
    }

    @Override
    public void method7() {
        System.out.println("CombinedInterface method7");
    }
}

public class TestInterface {
    public static void methodUsingInterface1(Interface1 interface1) {
        interface1.method1();
        interface1.method2();
    }
    public static void methodUsingInterface2(Interface2 interface2) {
        interface2.method3();
        interface2.method4();
    }
    public static void methodUsingInterface3(Interface3 interface3) {
        interface3.method5();
        interface3.method6();
    }

    public static void methodUsingCombinedInterface(CombinedInterface combinedInterface) {
        combinedInterface.method7();
        combinedInterface.method1();
        combinedInterface.method3();
        combinedInterface.method5();
    }
    public static void main(String[] args) {
        ImplementationClass implementationClass = new ImplementationClass();

        methodUsingInterface1(implementationClass);
        methodUsingInterface2(implementationClass);
        methodUsingInterface3(implementationClass);
        methodUsingCombinedInterface(implementationClass);
    }
}
