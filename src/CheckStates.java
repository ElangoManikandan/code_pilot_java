//class Mobile {
//    synchronized void call(Laptop laptop) {
//        System.out.println("Mobile locked...");
//        try {
//            Thread.sleep(1000);
//        } catch(Exception e) {}
//        laptop.sms();
//    }
//
//    synchronized void sms() {
//        System.out.println("SMS from Mobile");
//    }
//}
//
//class Laptop {
//    synchronized void call(Mobile mobile) {
//        System.out.println("Laptop locked...");
//        try { Thread.sleep(1000); } catch(Exception e) {}
//        mobile.sms();
//    }
//
//    synchronized void sms() {
//        System.out.println("SMS from Laptop");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Mobile m = new Mobile();
//        Laptop l = new Laptop();
//
//        Thread t1 = new Thread(() -> m.call(l));
//        Thread t2 = new Thread(() -> l.call(m));
//
//        t1.start();
//        t2.start();
//    }
//}

public class CheckStates {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait();  // goes into WAIT SET
                } catch (Exception e) {}
            }
        });

        t1.start();
        Thread.sleep(100);

        System.out.println(t1.getState());   // prints WAITING
    }
}
