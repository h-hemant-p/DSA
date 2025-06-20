# code for single linked list

class SLL:
    class Node:
        def __init__(self, data):
            self.data = data
            self.next = None

    def __init__(self):
        self.head = None
        self.size = 0

    def add(self, data):
        node = self.Node(data)
        if self.head is None:
            self.head = node
        else:
            current = self.head
            current.next = node
        self.size += 1

