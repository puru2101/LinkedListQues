
class Node{
    int data;
    Node next;

    Node (int x){
        this.data=x;
    }

    static  void transverse(Node head){
        Node curr= head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    static Node insertatfirst(Node head,int data){
        Node temp = new Node(data);
        temp.next=head;
        return temp;
    }

    static Node insertatend(Node head,int data){
        Node temp = new Node(data);
        Node curr= head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        return head;
    }

    static Node insertatposition(Node head,int data,int nodedata){
        Node temp = new Node(data);
        Node curr= head;
        while(curr.data!=nodedata){
          curr=curr.next;

        }
        temp.next=curr.next;
        curr.next=temp;
        return head;

    }
    static Node deleteatfirst(Node head) {
        if(head.next==null) {
            return null;
        }
        return head.next;
    }

    static Node deleteatlast(Node head) {
        if(head.next==null) {
            return null;
        }
        Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
        return head;
    }
    static Node deleteatpostion(Node head,int nodedata) {
        if(head.next==null) {
            return null;
        }
        Node curr=head;
        while(curr.data!=nodedata){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }

    static int searchpositon(Node head,int data){
        Node curr= head;
        int position =1;
        while(curr.data!=data){
            position++;
           curr= curr.next;
           if(curr.next==null) {
               System.out.println("Not exist");
               return -1;
           }
        }

        return position;
    }


}


public class Test {

    public static void main(String[] args) {
        Node head = new Node(10);
        Node n1 = new Node(20);
        Node n2 = new Node(30);
        Node n3 = new Node(40);

        head.next=n1;
        n1.next=n2;
        n2.next=n3;

        Node.transverse(head);
        System.out.println("-------------------");

//        Node newhead=Node.insertatfirst(head,35);
//        Node.transverse(newhead);
//
//        System.out.println("-------------------");
//
//        Node newlinklist=Node.insertatend(head,50);
//        Node.transverse(newlinklist);

//        System.out.println("-------------------");
//
//        Node newlinklis=Node.insertatposition(head,25,20);
//        Node.transverse(newlinklis);
//

//        System.out.println("-------------------");
//        Node deleteatfirst=Node.deleteatfirst(head);
//        Node.transverse(deleteatfirst);
//


//        System.out.println("-------------------");
//        Node deleteatlast=Node.deleteatlast(head);
//        Node.transverse(deleteatlast);

//        System.out.println("-------------------");
//        Node deleteatpostion=Node.deleteatpostion(head,20);
//        Node.transverse(deleteatpostion);

        System.out.println("-------------------");
        int postition= Node.searchpositon(head,80);
        System.out.println(postition);
    }

}
