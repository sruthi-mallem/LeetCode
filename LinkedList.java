class LinkedList {
    //head is the attribute 
    //node
    static class Node {
        int value;
        Node next;
        //constructor
        Node(int d ) {
            value=d;
            next=null;
        }
    }
    Node head;

    public void addValue(int key) {
        Node new_node= new Node(key);//a new node for the inserted value
        new_node.next=null;
        if(head==null){
            new_node=head;   //if the list is empty 
        }
        else {                //the list contains numbers       
            Node current = head;
            while(current.next!=null) {
                current=current.next;
            }
            current.next=new_node; //inserting a value at the end 
        }
    } 

    public void deleteValue(int key) {
        Node curr_node=head, prev=null;

        //1.if head itself has the key 
        if(curr_node!=null && curr_node.value==key) {
            head = curr_node.next; // head got changed 
        }

        //2.if key is in middle 
        while(curr_node!=null && curr_node.value!=key) {
            prev=curr_node;
            curr_node=curr_node.next;
        }
        if(curr_node!=null) {
            prev.next=curr_node.next; //assigning to the next path value
            curr_node.next=null;       // making the deleted pointer value null
        }

        //3.if key value not found 
        if(curr_node==null) {
            System.out.println("not found");
        }
    }

    public Integer getSize() {
        int count=0;
        Node curr_node=head;
        while(curr_node!=null ) {   //until null value it will traverse and take the count 
            count++;                //is it better to say curr_node.next!=null ?
            curr_node=curr_node.next;
        }
        return count;
    }

}
//confusion in what to return in the functions above ?
