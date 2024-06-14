//import java.util.*;

class Queue {
    int data[], front, rear, size, i;

    Queue(int len) {
        data = new int[len];
        front = rear = -1;
        size = 0;
    }

    public void enqueue(int item) {
        if (size == data.length) {
            System.out.println("Queue is full");
        }
        if (size == 0) {
            System.out.println("Queue is empty");
            front = 0;
        }
        rear++;
        size++;
        data[rear] = item;
        
    }

    public void dequeue() {
        if (rear == 0) {
            System.out.println("Queue is empty ");
        }
        front++;
        size--;
    }
    public void peek(){
        System.out.println(data[front]);
    }
    public void print(){
        if(front>-1){
            for(i=front;i<=rear;i++){
                System.out.print(data[i]+" ");
            }
    
        }
        else{
            System.out.println("Queue is Empty");
        }
    }
    public static void main(String[] args) {
        Queue obj = new Queue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.print();
        obj.dequeue();
        obj.print();


    }
}

