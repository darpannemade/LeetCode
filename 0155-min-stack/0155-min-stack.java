class MinStack {
private Node head;
private Node minhead;


    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public MinStack() {
        head=null;
        minhead=null;
    }
    
    public void push(int val) {
        Node temp=new Node(val);
        temp.next=head;
        head=temp;

        int min;
        if(minhead==null){
            min=val;
        }
        else{
            min=Math.min(minhead.data,val);
        }
        Node minTemp = new Node(min);
        minTemp.next = minhead;
        minhead = minTemp;
    }
    
    public int pop() {
        int top=head.data;
        head=head.next;
        minhead = minhead.next;
        return top;
    }
    
    public int top() {
        int top=head.data;
        return top;
    }
    
    public int getMin() {

    // This approach will give time compx as O(n) i.e iterating each time through the linkedlist.    
        // Node temp=head;
        // int min=head.data;
        // while(temp!=null){
        //     if(temp.data<min){
        //         min=temp.data;
        //     }
        //     temp=temp.next;
        // }
        // return min;

// So we will check everytime we push any value with a min value first when empty linkedlist then min=val and then will check every the value is pushed whether the value pushed is smaller than the currentmin check the code in push();

        return minhead.data;

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */