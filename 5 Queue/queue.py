
class Queue:
    def __init__(self):
        self.items = []
        self.size = 0

    def isEmpty(self):
        return self.size == 0

    def enqueue(self, item):
        self.items.append(item)
        self.size += 1

    def dequeue(self):
        if self.isEmpty():
            print("Queue is empty")
            return None
        self.size -= 1
        return self.items.pop(0)
    
    def getSize(self):
        return self.size
    
    def getQueue(self):
        return self.items
    
    def clear(self):
        self.items = []
        self.size = 0

    def peek(self):
        return self.items[0]

queue = Queue()
queue.enqueue(3)
queue.enqueue(6)
queue.enqueue(5)
queue.enqueue(19)
queue.enqueue(1)

print(queue.getQueue())
print(queue.dequeue())
queue.enqueue(133)
print(queue.getQueue())
print(queue.dequeue())
queue.enqueue(99)
print(queue.getQueue())