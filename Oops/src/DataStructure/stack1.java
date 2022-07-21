package DataStructure;

public class stack1 {
    int stack1[] =new int[5];
    int top = 0;

    public void  push(int data){
        stack1[top] = data;
        top++;
    }
    public int pop(){
        int data;
        top--;
        data = stack1[top];
        stack1[top] = 0;
        return data;
    }
    public int size(){
        return top;
    }
    public void show()
    {
        for (int n:stack1
             ) {
            System.out.println(n + " ");
        }
    }
}
