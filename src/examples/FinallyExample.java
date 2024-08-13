package examples;

public class FinallyExample {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try");
            throw new RuntimeException("some exception");
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        } finally {
            System.out.println("Finally block exceuting");
        }

    }
}
