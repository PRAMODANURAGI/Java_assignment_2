   //  Question 19  //

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling1 {

    public static void main(String[] args) {
        try {
            // Code that might throw an exception
            int x = 10 / 0; // ArithmeticException
            String s = null;
            int y = s.length(); // NullPointerException
            int[] arr = new int[5];
            arr[10] = 10; // ArrayIndexOutOfBoundsException
            
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Generic Exception: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
    }
}
