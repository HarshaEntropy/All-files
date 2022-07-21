public class stack {
    //int capacity = 2;
    int stack1[] = new int[5];

    int top = 0;
    public void push(int data) {
        if (!isFull()){
       // if (size() == capacity)
         //   expand();
        stack1[top] = data;
        top++;}
        else System.out.println("Stack is full!");
    }
    public int pop() {
        int data = 0;
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            top--;
            data = stack1[top];
            stack1[top] = 0;
           // strink();
        }
        return data;
    }/*
    private void strink() {
        int length = size();
        if (length <= (capacity / 2) / 2) {
            capacity = capacity / 2;
            int newStack[] = new int[capacity];
            System.arraycopy(stack1, 0, newStack, 0, length);
            stack1 = newStack;

        }
    }*/

    public int peek() {
        int data;
        data = stack1[top - 1];
        return data;
    }


    public int size() {
        return top;
    }

    public void show() {
        for (int n : stack1
        ) {
            System.out.print(n + " ");
        }
        System.out.print("\n");
    }
/*
    public void expand() {
        int length = size();
        int newStack[] = new int[capacity * 2];
        System.arraycopy(stack1, 0, newStack, 0, length);
        stack1 = newStack;
        capacity *= 2;
    }*/

    public boolean isEmpty() {
        return top<=0;
    }
    public boolean isFull(){
        return top==5;
    }
}