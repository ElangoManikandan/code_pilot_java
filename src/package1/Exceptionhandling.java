package package1;
class UserDefined extends Exception{
    UserDefined(String str){
        super(str);
        System.out.println("It is a User Defined Exception");
    }
}

public class Exceptionhandling {
    static int divide(int a,int b) throws UserDefined{
        if(b==0) {
            throw new UserDefined("Divide by Zero");
        }else {
            return a / b;
        }
    }
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            System.out.println(divide(a,b));
        }

        catch (UserDefined U){
            System.out.println(U.getMessage());
        } catch (ArithmeticException E) {
            System.out.println("Division by Zero");
        }
        System.out.println("Hello Dev");
    }
}
