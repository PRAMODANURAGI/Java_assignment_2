   //  Question 20  //

public class NegArrayException1 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            // NegativeArrayIndexOutOfBoundsException
            int x = arr[-1]; 
            // ArithmeticException
            int y = 10 / 0; 

        } catch (NegativeArrayIndexOutOfBoundsException e) {
            System.out.println("NegativeArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }
}
