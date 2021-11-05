package question4_1;

public class LinkedList{
    int size;
    ListNode head;
    private static Object obj = new Object();

    public LinkedList() {
        this.size = 0;
        head = new ListNode(0);
    }

    public void addAtPosition(int index, int element){
        synchronized (obj) {
            System.out.print(Thread.currentThread().getName() + " is adding " + element);
            if(index > size) return;
            if(index < 0) index = 0;
            size++;
            System.out.println(" Now size is " + size);
            ListNode pre = head;
            while(index-- > 0) {
                pre = pre.next;
            }

            ListNode newNode = new ListNode(element);
            newNode.next = pre.next;
            pre.next = newNode;
        }
    }

    public void removeAtPosition(int index, int element){
        synchronized (obj) {
            System.out.print(Thread.currentThread().getName() + " is removing " + element);
            if(index < 0 || index >= size) return;
            size--;
            System.out.println(" Now size is " + size);
            ListNode pre = head;
            while(index-- > 0) pre = pre.next;
            pre.next = pre.next.next;
        }
    }

    public int getFirst() {
        synchronized (obj) {
            return head.next.val;
        }
    }

    public int getLast() {
        synchronized (obj) {
            ListNode tail = head;
            for(int i = 0; i < size; i++) tail = tail.next;
            return tail.val;
        }
    }

    public int size(){
        synchronized (obj) {
            return size;
        }
    }
}
