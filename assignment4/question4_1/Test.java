package question4_1;

public class Test {
    public static void main(String[] args) {
        TargetList list = new TargetList();

        Thread t1 = new Thread(list);
        Thread t2 = new Thread(list);
        Thread t3 = new Thread(list);
        Thread t4 = new Thread(list);

        t1.setName("Thread#1");
        t2.setName("Thread#2");
        t3.setName("Thread#3");
        t4.setName("Thread#4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
