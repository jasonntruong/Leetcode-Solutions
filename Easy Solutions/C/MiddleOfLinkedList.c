//Runtime: 0 ms, beats 100.0% of C online submissions
//Memory Usage: 5.9 MB beats 58.98% of C online submissions

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* middleNode(struct ListNode* head){
    //hare and turtle
    struct ListNode* fast = head;
    struct ListNode* slow = head;
    
    while (fast != NULL && fast->next != NULL) {
        fast=fast->next->next;
        slow=slow->next;
    }
    
    return slow;
}