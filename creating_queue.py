from collections import deque
class Queue:
    def __init__(self):
        self.q=deque()
    def is_empty(self):
        if len(self.q)==0:
            print("Queue is empty")
        else:
            print("Queue is not empty")
    def Enqueue(self,val):
        self.q.appendleft(val)
        print(f"enqueue_ele:{val}")
    def Dequeue(self):
        if self.q:
            x=self.q.pop()
            print(f"popped_ele:{x}")
            
        else:
            print("Queue is empty")
    def get_first_element(self):
        if self.q:
            y=self.q[0]
            print(f"first_ele:{y}")
        else:
            print("Queue is empty")
hey_queue=Queue()
hey_queue.is_empty()
hey_queue.Enqueue(7)
hey_queue.Enqueue(8)
hey_queue.get_first_element()
hey_queue.Dequeue()
hey_queue.get_first_element()
hey_queue.Dequeue()
hey_queue.Dequeue()

