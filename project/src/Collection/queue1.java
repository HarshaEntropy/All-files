package Collection;

public class queue1 {
    private ListNode front1;
    private ListNode rear2;
    private int length;
    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    
}
