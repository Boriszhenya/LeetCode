public class Aufgabe_141 {
    static class Solution {
        public boolean hasCycle(ListNode head) {
            if (head == null) return false;

            ListNode slow = head;
            ListNode fast = head;
            System.out.println(slow);
            System.out.println(fast);
            // fast бежит на 2 шага, поэтому проверяем fast и fast.next
            while (fast != null && fast.next != null) {
                slow = slow.next;
                System.out.println(slow.val);// 1 шаг
                fast = fast.next.next;
                System.out.println(fast.val);// 2 шага

                if (slow == fast) {        // встретились => цикл есть
                    return true;
                }
            }
            return false;
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val ;
        }
    }

    static ListNode buildList(int[] values, int pos) {
        if (values == null || values.length == 0) return null;

        ListNode head = new ListNode(values[0]);
        ListNode cur = head;

        ListNode cycleEntry = (pos == 0) ? head : null;

        for (int i = 1; i < values.length; i++) {
            cur.next = new ListNode(values[i]);
            cur = cur.next;

            if (i == pos) cycleEntry = cur;
        }

        if (pos >= 0) {
            cur.next = cycleEntry; // замыкаем хвост на cycleEntry
        }
        return head;
    }


    public static void main(String[] args) {
        Solution sol = new Solution();

        // Пример 1: [3,2,0,-4], pos=1 => true
        ListNode a = buildList(new int[]{3, 2, 0, -4}, 1);
        System.out.println(a);

        System.out.println(a);
        System.out.println("Test 1 (ожидается true): " + sol.hasCycle(a));

//        // Пример 2: [1,2], pos=0 => true
//        ListNode b = buildList(new int[]{1, 2}, 0);
//        System.out.println("Test 2 (ожидается true): " + sol.hasCycle(b));
//
//        // Пример 3: [1], pos=-1 => false
//        ListNode c = buildList(new int[]{1}, -1);
//        System.out.println("Test 3 (ожидается false): " + sol.hasCycle(c));
//
//        // Пример 4: [], pos=-1 => false
//        ListNode d = buildList(new int[]{}, -1);
//        System.out.println("Test 4 (ожидается false): " + sol.hasCycle(d));
    }
}
