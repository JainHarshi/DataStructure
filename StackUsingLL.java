package Stack;

public class StackUsingLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    public static class stack{
        public static Node head;
        public static boolean isEmpty(){
            return head == null;

        }
        //PUSH
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;


        }
        //POP
        public static int pop(){
            if(isEmpty()) return -1;
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()) return -1;
            return head.data;
        }

        public static void main(String[] args) {
            stack s = new stack();
            s.push(1);
            s.push(12);
            s.push(13);
            s.push(14);
            s.push(15);

          while (!s.isEmpty()) {
              System.out.println(s.pop());
          }

        }
    }
}
