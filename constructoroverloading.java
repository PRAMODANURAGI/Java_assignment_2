//A-2 Ques4


class Rectangle {
    int length;
    int width;

    // Constructor with no parameters
    public Rectangle() {
        this.length = 0;
        this.width = 0;
        System.out.println("Default constructor called");
    }

    // Constructor with one parameter
    public Rectangle(int side) {
        this.length = side;
        this.width = side;
        System.out.println("Square constructor called with side: " + side);
    }

    // Constructor with two parameters
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        System.out.println("Rectangle constructor called with length: " + length + " and width: " + width);
    }

    public int calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        // Using the default constructor
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Area: " + rectangle1.calculateArea());

        // Using the constructor with one parameter
        Rectangle rectangle2 = new Rectangle(5);
        System.out.println("Area: " + rectangle2.calculateArea());

        // Using the constructor with two parameters
        Rectangle rectangle3 = new Rectangle(4, 6);
        System.out.println("Area: " + rectangle3.calculateArea());
    }
}