package question4_1;

public class TargetList implements Runnable{
    private LinkedList target = new LinkedList();
    @Override
    public void run() {
        target.addAtPosition(0,1);
        //System.out.println(Thread.currentThread().getName() + " get size is " + target.size);
        target.addAtPosition(0,3);
        target.removeAtPosition(0, 2);
        System.out.println(Thread.currentThread().getName() + " get first node is " + target.getFirst());
        System.out.println(Thread.currentThread().getName() + " get last node is " + target.getLast());
        System.out.println(Thread.currentThread().getName() + " get size is " + target.size);
    }
}
