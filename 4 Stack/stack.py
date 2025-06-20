# Code for Custom Stack

class Stack:
    def __init__(self):
        self.items = []
        self.size = 0

    def push(self, item):
        self.items.append(item)
        self.size += 1

    def pop(self):
        self.size -= 1
        return self.items.pop()

    def peek(self):
        return self.items[-1]

    def isEmpty(self):
        return self.size == 0

    def getSize(self):
        return self.size

    def getStack(self):
        return self.items
    
    def clear(self):
        self.items = []
        self.size = 0

stack = Stack()

stack.push(1)
stack.push(2)
stack.push(3)
print(stack.getStack())

stack.pop()
print(stack.getStack())

print(stack.peek())

print(stack.isEmpty())

print(stack.getSize())

stack.clear()
print(stack.getStack())