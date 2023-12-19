class Node1 {
    int data;
    Node1 next;
    Node1 previous;

    Node1(int x) {
        data = x;

    }

    static void transverseforward(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    static void transversebackward(Node1 head) {
        Node1 curr = head;
        while (curr.next != null) {
            //   System.out.print(curr.data+" ");
            curr = curr.next;
        }
        while (curr != null) {
            System.out.print(curr.data+ " ");
            curr = curr.previous;
        }
    }

    static Node1 reverseoflinkedlist(Node1 head) {
        Node1 curr = head;
        while (curr != null) {
            Node1 next = curr.next;

        }



    public class Test2 {
        public static void main(String[] args) {

            Node1 head = new Node1(1);
            Node1 n1 = new Node1(2);
            Node1 n2 = new Node1(3);
            Node1 n3 = new Node1(4);
            Node1 n4 = new Node1(5);
            Node1 n5 = new Node1(6);

            head.next = n1;
            n1.previous = head;
            n1.next = n2;
            n2.previous = n1;
            n2.next = n3;
            n3.previous = n2;
            n3.next = n4;
            n4.previous = n3;
            n4.next = n5;
            n5.previous = n4;

             Node1.transversebackward(head);
        }
    }

