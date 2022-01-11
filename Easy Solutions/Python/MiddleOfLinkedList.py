#Runtime: 28 ms, beats 85.38% of Python3 online submissions
#Memory Usage: 14.3 MB

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        #hare and turtle
        slow = fast = head

        while (fast != None and fast.next != None):
            slow = slow.next
            fast = fast.next.next

        return slow