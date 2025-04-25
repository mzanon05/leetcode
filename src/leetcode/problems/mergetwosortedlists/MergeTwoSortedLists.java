package leetcode.problems.mergetwosortedlists;

public class MergeTwoSortedLists {

    public static class ListNode {
        private int val;
        private ListNode next;

        public ListNode() {}

        public ListNode(int... values) {
            if (values.length < 1) {
                throw new RuntimeException("Must have at least one element in the list");
            }
            if (values.length == 1) {
                this.val = values[0];
            } else {
                this.val = values[0];
                this.next = createListNode(1, values);
            }
        }

        private ListNode createListNode(int index, int... values) {
            if (values.length == index + 1) {
                return new ListNode(values[index]);
            } else {
                return new ListNode(values[index], createListNode(index + 1, values));
            }
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
        if (list1 == null && list2 == null) {
            return null;
        }
        //  Iterating at the same time in bove lists, comparing each element to one another.
        //  While the elements of X are smaller, keep placing the elements in the return list and advancing X index,
        // if we reach the end of the list, than just place the remaining elements from the other list at the end.
        if (list1 == null) {
            return new ListNode(list2.getVal(), list2.getNext());
        }
        if (list2 == null) {
            return new ListNode(list1.getVal(), list1.getNext());
        }
        //Get the smaller element from the lists head and place it at the start of the response list
        if (list1.getVal() <= list2.getVal()) {
            return new ListNode(list1.getVal(), mergeTwoLists(list1.getNext(), list2));
        } else {
            return new ListNode(list2.getVal(), mergeTwoLists(list1, list2.getNext()));
        }
    }

}
