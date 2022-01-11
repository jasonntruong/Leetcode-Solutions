#Runtime: 548 ms, faster than 72.76% of Python3 online submissions
#Memory Usage: 53.1 MB, beats 18.06% of Python3 online submissions

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def minDepth(self, root: Optional[TreeNode]) -> int:
            if not root:
                return 0
            elif root.left and not root.right:
                return 1 + self.minDepth(root.left)
            elif root.right and not root.left:
                return 1 + self.minDepth(root.right)
            elif not root.left and not root.right:
                return 1
            else:
                return min(self.minDepth(root.left), self.minDepth(root.right)) + 1