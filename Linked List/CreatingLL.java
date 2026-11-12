public class CreatingLL {

    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static class LinkedList{
        node head = null;
        node tail = null;
        int size = 0;
        void insertAtEnd(int data){
            node temp = new node(data);
            if(head==null){
                head = temp;
            }else{
                tail.next = temp;
            }
            tail=temp;
            size++;
        }
        void insertAtBeg(int data){
            node temp = new node(data);
            if(head==null){
                head=tail=temp;
            }else{
                temp.next=head;
                head=temp;
            }
            size++;
        }
        void insertAt(int idx,int data){
            if (idx==0){
                insertAtBeg(data);
            }else if(idx==size){
                insertAtEnd(data);
            }else{
                node newNode = new node(data);
                node temp = head;
                for (int i=0;i<idx-1;i++){
                    temp=temp.next;
                }
                newNode.next=temp.next;
                temp.next=newNode;
                size++;
            }
        
            
        }
        void getAt(int idx){
            node temp = head;
            for (int i = 0; i < idx; i++) {
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
        void delete(int idx){
            if(idx==0){
                head=head.next;
                size--;
                return;
            }
            node temp = head;
            for (int i = 0; i < idx-1; i++) {
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
            if(idx==size-1){
                tail=temp;
            }
            
        }
        void display(){
            node temp = head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
            // System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtBeg(0);
        ll.insertAt(4,7 );
        ll.display();
        ll.getAt(3);
        System.out.println(ll.size);
    }
}
