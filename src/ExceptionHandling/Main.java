package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        try{
            int a=10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            int b=10/0;
            System.out.println(b);
        }
    }
}
