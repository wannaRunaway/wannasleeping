package leetcode;

/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit.
 Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
Example 1:
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Example 2:
Input: l1 = [0], l2 = [0]
Output: [0]

Example 3:
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
Constraints:
The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.
*/
public class AddTwoNums {

    public static void main(String[] args) {
        ListNode ls1 = new ListNode(8, new ListNode(1, new ListNode(2)));
        ListNode ls2 = new ListNode(4, new ListNode(5, new ListNode(6)));
        ListNode listNode = addTwoNumbers(ls1, ls2);
        System.out.println(listNode.val+"s"+listNode.next.val+"s"+listNode.next.next.val);
    }

    /*
    * 注意：
    * 1、reverse order逆序排列，所以不用想的很多，直接相加即可;
    * 2、如3+9=12，nodes contains a single digit,所以当前数字是12%10=1;
    * 3、下一位继续相加，但是判断前位是否有进位，也就是12/10？>0，有就加1
    * 4、加到最后，2个链表元素都为空，就把进位1放上去。
    *
    * 解析：
    * 1、不用看例子导致逻辑混乱，直接就是加法，不过是向后进一位；
    * 2、先预设一个dummyHead=0;
    * 3、然后酸楚current.next,因为链表结构就是当前的数值value，向后一位的指针，也就是listnode.next，所以先预设当前dummyHead=0;
    * 4、再把current.next赋值给value,用这个作为起始变量
    * */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //最后得出的是个listnode
        ListNode dummyHead = new ListNode(0);
        ListNode dummy1 = l1, dummy2 = l2, current = dummyHead;
        int carry = 0;
        while (dummy1!=null||dummy2!=null){
            //1、计算carry和下一个节点
            int x = (dummy1!=null)?dummy1.val:0;
            int y = (dummy2!=null)?dummy2.val:0;
            int sum = x + y + carry;
            carry = sum/10;
            current.next = new ListNode(sum%10);
            current = current.next;
            if (dummy1!=null)dummy1=dummy1.next;
            if (dummy2!=null)dummy2=dummy2.next;
        }
        if (carry>0){
            current.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    // * Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
