package task1;

public class Test
{

    public static void main(String[] args)
    {

        ListNode h1 = new ListNode(9, new ListNode(5, new ListNode(3)));
        ListNode h2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode listNode = addTwoNumbers(h1, h2);

        while (listNode.next != null)
        {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        if (l1 == null && l2 == null)
        {
            return null;
        }
        if (l1 == null)
        {
            return l2;
        }
        if (l2 == null)
        {
            return l1;
        }

        ListNode returnListNode = new ListNode(0);
        ListNode head = returnListNode;

        do
        {

            int tmpSum = l1.val + l2.val + returnListNode.val;
            if (tmpSum >= 10)
            {
                returnListNode.val = tmpSum - 10;
                returnListNode.next = new ListNode(1);
            }

            l1 = l1.next == null ? new ListNode(0) : l1.next;
            l2 = l2.next == null ? new ListNode(0) : l2.next;
            returnListNode = returnListNode.next;

        } while (l1.next != null || l2.next != null);


        //计算最后一位
        int tmpSum = l1.val + l2.val + returnListNode.val;
        if (tmpSum >= 10)
        {
            returnListNode.val = tmpSum - 10;
            returnListNode.next = new ListNode(1);
        }

        return head;


    }



}
