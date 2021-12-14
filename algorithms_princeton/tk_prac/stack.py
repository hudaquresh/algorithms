class Stack:
    r"""
    Class constructed to simulate
    the stack data structure. 
    """

    # Constructor method 
    def __init__(self, mystack=None):
        if mystack is None: 
            self.mystack = []  
        else: 
            self.mystack = mystack  

    # Add a value to the top of the stack 
    # here that is the end of the list 
    def push(self, val):
        self.mystack.append(val) 
   
    # Look at the top of the stack
    # here it is the end of the list  
    def peek(self):
        if self.isEmpty(self):  
            return None
        else: 
            return self.mystack[-1] 
   
    # Take off the value on the top of the stack 
    # Here delete the last value in the list  
    def pop(self):
        if self.isEmpty(self):  
            return None
        else:
            pop_val = self.mystack[-1]
            self.mystack = self.mystack[:-1] 
            return pop_val
   
    # Tell if the stack is empty or not 
    # i.e is the list empty  
    def isEmpty(self):
        if self.mystack == []: 
            return True 
        else: 
            return False 

if __name__ == "__main__": 
    
    test = Stack() 
    if test.isEmpty(): 
        print("Test is empty, let's fill with values") 
        test.push(5)
        test.push(6)
        test.push(7)
        print("Let's check what values we filled it with") 
        while not test.isEmpty(): 
            val = test.pop() 
            print("Value popped is: ", val) 
    

     
