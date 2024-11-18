   // Question 11   //

class Num {
    int num;

    Num(int num) {
        this.num = num;
    }

    void showNum() {
        System.out.println(num);
    }
}

class HexNum extends Num {
    HexNum(int num) {
        super(num);
    }

    @Override
    void showNum() {
        System.out.println("Hexadecimal: " + Integer.toHexString(num));
        System.out.println("Octal: " + Integer.toOctalString(num));
    }
}

public class HexaOcta {
    public static void main(String[] args) {
        Num num = new Num(42);
        num.showNum(); // Output: 42

        HexNum hexNum = new HexNum(42);
        hexNum.showNum(); 
    }
}