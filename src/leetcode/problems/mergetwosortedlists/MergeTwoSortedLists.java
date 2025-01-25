package leetcode.problems.mergetwosortedlists;

public class MergeTwoSortedLists {

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode() {}

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public int getVal() {
            return val;
        }

        public ListNode getNext() {
            return next;
        }

        @Override
        public String toString() {
            var builder = new StringBuilder();
            builder.append("[");
            toString(builder);
            builder.append("]");
            return builder.toString();
        }

        private StringBuilder toString(StringBuilder builder) {
            if (next != null) {
                builder.append(val);
                builder.append(", ");
                return next.toString(builder);
            } else {
                return builder.append(val);
            }
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        System.out.println("ListOne: "+list1);
        System.out.println("ListTwo: "+list2);

        return null;
    }

}
