   //  Question 16  //

public class StaticDemo {

    private static int count = 0;

    private int id;

    public static void printCount() {
        System.out.println("Current count: " + count);
    }

    public void printId() {
        System.out.println("Object ID: " + id);
    }

    public StaticDemo() {
        count++;
        id = count;
    }
    public static void main(String[] args) {
        // Accessing static members without creating an object
        StaticDemo.printCount();

        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();

        obj1.printId();
        obj2.printId();

        // Accessing static members through objects (also possible)
        obj1.printCount();
        obj2.printCount();
    }
}