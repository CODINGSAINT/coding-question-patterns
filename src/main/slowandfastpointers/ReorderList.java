package slowandfastpointers;

//https://leetcode.com/problems/reorder-list/ (M)
public class ReorderList {

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        //Find Half of the linkedList
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        ListNode reversed = reverse(slow);
        ListNode begin = head;
        while (begin != null && reversed != null) {
            ListNode temp = begin.next;
            begin.next = reversed;
            begin = temp;

            temp = reversed.next;
            reversed.next = begin;
            reversed = temp;
        }
        if (begin != null)
            begin.next = null;
    }

    ListNode reverse(ListNode head) {

        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}


