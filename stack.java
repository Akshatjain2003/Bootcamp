import java.util.*;
public class stack <T> {
    ArrayList <T> arr;
    int size, top, i;
    stack(int size){
        top=-1;
        this.size = size;
        arr = new ArrayList<T>(size);
    }
    public void peek(){

        System.out.println(arr.get(top));
    }
    public void push(T data){
        if(top >= size){
            System.out.println("Stack is full");
        }
        top++;
        arr.add(top,data);
        System.out.println(data+ "added to stack");
    }
    public void pop (){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        arr.remove(top);
        top--;
    }
    public static void main(String[] args) {
        stack<Integer> obj = new stack<>(10);
        obj.push(100);
        obj.peek();
        obj.push(200);
        obj.peek();
        obj.push(300);
        obj.peek();


    }


    
}