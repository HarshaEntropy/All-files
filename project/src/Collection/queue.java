package Collection;

public class queue {
    int size;
    int queue[] = new int[5];
    int front;
    int rear;



    public void  add(int data){
        if(!isFull()){
        queue[rear] = data;
        rear = rear+1;
        size = size+1;}
        else System.out.println("queue is full");
    }
    public int peek() {
        int data = 0;
        if (!isEmpty()) {
            data = queue[front - 1];
        } else System.out.println("Queue is Empty");
        return data;
    }
    public int poll(){
        int data = queue[front];
        front = front+1;
        size=size-1;
        return data;
    }
    public void show(){
        System.out.println("Added Elements: ");
        for (int i=0;i<size;i++){
            System.out.print(queue[front+i]+" ");
        }
        System.out.println("\n");
        /*
        for (int n:
             queue) {
            System.out.print(n+" ");
        }
        System.out.print("\n");*/
    }
    public  int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
             return size==5;
    }
    public int remove(){
        int data = queue[front];
        front = front+1;
        rear = rear-1;
        size=size-1;
        return data;
    }

}
