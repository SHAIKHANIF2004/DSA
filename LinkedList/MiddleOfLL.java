package LinkedList;

public class MiddleOfLL {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Method to find middle node
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // move 1 step
            fast = fast.next.next;    // move 2 steps
        }

        return slow;
    }

    // Main method
    public static void main(String[] args) {

        // Creating linked list: 1 → 2 → 3 → 4 → 5 → 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        // Finding middle node
        ListNode middle = middleNode(head);

        // Printing result
        System.out.println("Middle node value: " + middle.val);
    }
}
