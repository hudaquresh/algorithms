from collections import deque
# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


if __name__ == "__main__": 
   
    myroot = TreeNode()
    root = [1, None, 2, 3] 

    myroot.val = 1 
    myroot.left = TreeNode()
    myroot.left.val = None 
    myroot.right = TreeNode() 
    myroot.right.val = 2
    myroot.right.left = TreeNode()
    myroot.right.left.val = 3  

    def myrun(myroot): 

        q = deque()
        q.append((myroot, False))
        out = [] 

        while q: 
            node, visited = q.popleft()
            print(node) 
            print(visited)

            if visited:
                print('node.val:', node.val)  
                out.append(node.val) 
                continue 
            
            if node.right is not None: 
                q.appendleft((node.right, False))
            q.appendleft((node, True))

            if node.left is not None: 
                q.appendleft((node.left, False))
                
        return out 
    
    print(myrun(myroot)) 
