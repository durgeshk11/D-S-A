class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

/**
 * Q1.SinglyLL
 */
public class SinglyLL {
    public static Node head=null;
    public static Node tail=null;

    public static void  insertAtFirst(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            tail=node;
        }else{
            node.next=head;
            head=node;
        }
    }
    
    public static void insertAtLast(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            tail=node;
        }else{
            tail.next=node;
            tail=node;
        }
        
    }
    public static void insertAtIndx(int indx,int data){
        Node temp=new Node(-1);
        temp.next=head;
        int i=-1;
        boolean flag=true;
        Node node=new Node(data);

        if(indx==0)
            head=node;
        while(i<=indx && temp!=null && temp.next!=null){
            if(i+1==indx){
                Node temp1=temp.next;
                temp.next=node;
                temp.next.next=temp1;
                flag=false;
                break;
            }
            temp=temp.next;
            i++;
        }
        if(flag){
            temp.next=new Node(data);
            tail=temp.next;
        }
    }

    public static void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void deleteFirst(){
        if(head==null){
            System.out.println("Empty List");
            return;
        }else if(head.next==null){
            head=null;tail=null;
            return;
        }else{

            Node temp=head.next;
            head.next=null;
            head=temp;
        }
        System.out.println("delete successfully");
    }
    public static void deleteLast(){
        if(head==null){
            System.out.println("Empty List");
            return;
        }else if(head.next==null){
            head=null;tail=null;
        }else{
            Node temp=head;
            while(temp.next!=null){
                if(temp.next.next==null){
                    tail=temp;
                    temp.next=null;
                    break;
                }else{
                    temp=temp.next;
                }
            }
        }
        System.out.println("delete successfully");
    }

    public static void main(String[] args) {
        insertAtFirst(1);
        insertAtFirst(2);
        insertAtFirst(3);
        printList();
        System.out.println();
        insertAtLast(4);
        insertAtLast(5);
        printList();
        System.out.println();
        insertAtIndx(0, 6);
        insertAtIndx(2, 7);
        printList();
        System.out.println();
        deleteFirst();
        printList();
        System.out.println();
        deleteLast();
        printList();
        System.out.println();
        deleteLast();
        printList();
        System.out.println();
        deleteLast();
        printList();
        System.out.println();
        deleteLast();
        printList();
        System.out.println();
        deleteLast();
        printList();
        System.out.println();
        deleteLast();
        printList();
        System.out.println();
        deleteLast();
        printList();
        System.out.println();

    }
}