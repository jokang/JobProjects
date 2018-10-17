package cn.jokang.algorithms.leetcode;

import cn.jokang.algorithms.datastructure.ListNode;

public class RemoveDuplicatedFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p1 = head;
        ListNode p2;
        while (p1.next != null) {
            p2 = p1;
            while (p2.next != null && p1.val == p2.next.val) {
                p2 = p2.next;
            }
            if (p1 == p2) {
                p1 = p1.next;
            } else {
                p1.next = p2.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {

    }
}
