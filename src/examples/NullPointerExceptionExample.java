package examples;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            String msg1 = null;
            String msg2 = "Hi hello";
            System.out.println("msg2 length is : "+msg2.length());
            System.out.println("msg1 length is : "+msg1.length());
        }catch (NullPointerException e){
            System.out.println("Exception occured : "+e.getMessage());
        }
    }
}
