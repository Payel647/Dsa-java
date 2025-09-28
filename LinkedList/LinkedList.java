class LinkedList{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class LinkedList1{
        Node head;//jodi akhane static keyword use kortam then both linked list created using this class tader head same hoto ar duto same linked list hoye jeto
        public int size(){
            int count=0;
            Node temp=head;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
        public void addFirst(int data){
            Node newNode= new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public void printList(){
            if(head==null){
                return;
            }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        public void addLast(int data){
            if(head==null) return;
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            Node newNode= new Node(data);
            temp.next=newNode;
        }
        public void addPos(int x,int data){
            Node newNode=new Node(data);
            Node temp=head;
            int curr=1;
            while(curr+1!=x){
                curr++;
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
        public void removeFirst(){
            if(head==null){
                return;
            }
            head=head.next;
        }
        public void removeLast(){
            if(head==null){
                return;
            }
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }
       public int find(int x){
           Node temp = head;
           int pos = 1;
           while(temp != null){
           if(temp.data == x){
            return pos;
            }
           pos++;
           temp = temp.next;
           }
           return -1; 
          }
          public int recFind(int x,Node head){
            if(head==null){
                return -1;
            }
            if(head.data==x){
                return 0;
            }
            int idx=recFind(x,head.next);
            if(idx==-1){
                return -1;
            }
            return idx+1;
          }
          public void reverse(){
            Node curr=head;
            Node prev=null;
            Node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;
          }
    }
    public static void main(String args[]){
       LinkedList1 li=new LinkedList1();
       li.addFirst(2);
       li.addFirst(3);
       li.addFirst(4);
       li.addLast(5);
       li.printList();
       System.out.println();
       System.out.println(li.size());
       if(li.size()==0){
        System.out.println("Linked List Empty");
       }else{
        System.out.println("Linked List is NOt Empty");
       }
       li.reverse();
       li.printList();
        System.out.println(li.find(2));
        System.out.println(li.recFind(2,li.head));
       li.addPos(2,9);
       li.removeFirst();
       li.removeLast();
       li.printList();
       //New linked list
       LinkedList1 li1=new LinkedList1();
       li1.addFirst(4);
       li1.addFirst(8);
       li1.addLast(9);
       li1.printList();
       System.out.println();
       System.out.println(li1.size());
       if(li.size()==0){
        System.out.println("Linked List Empty");
       }else{
        System.out.println("Linked List is NOt Empty");
       }
    }
}
