//Problem : 203. Remove Linked List Elements

class Solution {
    public ListNode removeElements(ListNode head, int val) {

        while(head!=null && head.val==val){
            head=head.next;
        }

        ListNode temp=head;
        ListNode ttemp=null;

        while(temp!=null){
            if(temp.val==val){
                ttemp.next=temp.next;
            }else{
                ttemp=temp;
            }
            temp=temp.next;
           
        }
        return head;        
    }
}