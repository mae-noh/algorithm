 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class solution_t {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode resultNode = new ListNode();
        ListNode current = resultNode;    

        while(l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        if(carry > 0) {
            current.next = new ListNode(carry);
        }

        return resultNode.next;
    }
}

// https://leetcode.com/problems/two-sum/
// https://leetcode.com/problems/add-two-numbers/description/

/*
두 개의 음수가 아닌 정수를 나타내는 두 개의 비어 있지 않은 연결 목록이 제공됩니다.
숫자는 역순 으로 저장되며 각 노드에는 단일 숫자가 포함됩니다. 두 숫자를 더하고 그 합계를 연결된 목록으로 반환합니다.
숫자 0 자체를 제외하고는 두 숫자에 선행 0이 포함되어 있지 않다고 가정할 수 있습니다.

입력: l1 = [2,4,3], l2 = [5,6,4]
 출력: [7,0,8]
 설명: 342 + 465 = 807.
예 2:

입력: l1 = [0], l2 = [0]
 출력: [0]
예시 3:

입력: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 출력: [8,9,9,9,0,0,0,1]
*/

9 9 9 9 9 9 9
9 9 9 9

8 9 9 9 0 0 0 1