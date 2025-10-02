package package2;

class Main{
    public static void main(String[] args) {

        int a=10;
        System.out.println(String.valueOf(a).length());
        int b=a;
         b=20;
         char c='A';
        System.out.println(Integer.valueOf(c));

        System.out.println(a);
        System.out.println(b);
        int[] numbers = {1, 2, 3};
        int[] copy = numbers;
        System.out.println("Before change:");
        System.out.println("numbers[0] = " + numbers[0]);
        System.out.println("copy[0] = " + copy[0]);
        copy[0] = 100;
        System.out.println("\nAfter change:");
        System.out.println("numbers[0] = " + numbers[0]);
        System.out.println("copy[0] = " + copy[0]);

    }
}