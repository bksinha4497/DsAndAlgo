package com.bk.gfg.ds.linked.list.singly;

public class AddTwoNumbers {
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

    public static void main(String[] args) {
        AddTwoNumbers obj = new AddTwoNumbers();
        ListNode l1=new ListNode(1,null);
        ListNode l2=new ListNode(2,null);
        obj.addTwoNumbers(l1,l2);
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = new ListNode();
        ListNode result = p1;
        int sum=0;
        int carry=0;
        while(l1!=null || l2!=null) {
            sum=0;
            if (l1 != null) {
                sum = sum+l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum=sum+l2.val;
                l2 = l2.next;
            }
            sum+=carry;
            if (sum>=10) {
                sum%=10;
                carry=1;
            }else{
                carry=0;
            }
            result.next = new ListNode(sum);
            result = result.next;
            if(carry==1){
                result.next=new ListNode(1);
            }
        }
        return p1.next;
    }
}
