public class recursion {
    public static int method(int n){
        if(n==0){
            return 0;
        }
        return method(n-1)+n++;
    }
    public class Rec1 {
        public static int fun(int n) {
            if (n == 1)
                return 1;
            System.out.println(n);
            return fun(n - 1) * n;
        }
    }
    public class Rec2 {
        static int f(int n) {
            if (n <= 0) return 0;
            return n + f(n - 2);
        }
        public static void main(String[] args) {

        }
    }
    public class Rec3 {
        static int fun(int n) {
            if (n == 3)
                return n;
            return fun(n + 1) + n;
        }
    }

    public class Rec4 {
        static void print(int n) {
            if (n == 0) return;
            System.out.print(n + " ");
            print(n - 1);
            System.out.print(n + " ");
        }
    }



    public static void main(String[] args) {
        System.out.println(method(4));
        System.out.println(Rec1.fun(4));
        System.out.println(Rec2.f(7));
        System.out.println(Rec3.fun(1));
        Rec4.print(3);
    }
}
