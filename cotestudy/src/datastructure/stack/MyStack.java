package datastructure.stack;

public class MyStack {
    private int size;
    private int[] contents;
    private int top;

    private MyStack(){

    }

    public void push(int input){
        if(top==size){
            System.out.println("datastructure.stack overflow");
            return;
        }
        contents[top++] = input;
    }

    public int pop(){
        if(top==0){
            System.out.println("nothing to pop");
            return 0;
        }
        return contents[--top];
    }


    public static MyStack makeStack(int size){
        MyStack stack = new MyStack();
        stack.size = size;
        stack.contents = new int[size];
        stack.top = 0;
        return stack;
    }




    public int getSize() {
        return size;
    }

    public int[] getContents() {
        return contents;
    }

    public int getTop() {
        return top;
    }

    public static void main(String[] args) {
        MyStack stack = MyStack.makeStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.getTop());
        stack.push(4);
        stack.push(5);
        System.out.println(stack.getTop());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}
