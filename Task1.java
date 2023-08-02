public class Task1 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode head = node1;
        ListNode reversed = ReverseLinkedList.reverse(head);

        ListNode current = reversed;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    static class ReverseLinkedList {
        public static ListNode reverse(ListNode head) {
            ListNode prev = null;
            ListNode current = head;
            ListNode next = null;
            while (current != null) {
                next = current.next; 
                current.next = prev;
                prev = current;
                current = next;
            }
            return prev;
        }
    }
}
