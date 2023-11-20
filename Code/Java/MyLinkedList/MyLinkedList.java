package Code.Java.MyLinkedList;

public class MyLinkedList {
    Node head;

    public MyLinkedList(int[] arr) {
        if (arr.length == 0) {
            head = new Node();
            return;
        }
        Node n = new Node(arr[0]);
        head = n;

        for (int i = 1; i < arr.length; i++) {
            n.next = new Node(arr[i]);
            n = n.next;
        }
    }

    public MyLinkedList() {
    }

    public void insert(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show() {
        if (head == null) {
            System.out.println("[ ]");
            return;
        }
        Node n = head;
        String s = "[";
        while (n.next != null) {
            s += (n.data);
            s += ", ";
            n = n.next;
        }
        s += n.data;
        s = s.substring(0, s.length());
        s += "]";
        System.out.println(s);
    }

    public void show(Node h) {
        if (h == null) {
            System.out.println("[ ]");
            return;
        }
        Node n = h;
        String s = "[";
        while (n.next != null) {
            s += (n.data);
            s += ", ";
            n = n.next;
        }
        s += n.data;
        s = s.substring(0, s.length());
        s += "]";
        System.out.println(s);
    }

    public void insertAtStart(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data) {
        Node node = new Node(data);
        node.data = data;

        if (index == 0) {
            insertAtStart(data);
            return;
        }

        Node n = head;

        for (int i = 1; i < index - 1; i++) {
            n = n.next;
        }

        node.next = n.next;
        n.next = node;

    }

    public void deleteAt(int index) {
        Node temp = null;

        Node n = head;

        if (index == 0) {
            head = n.next;
        } else {
            for (int i = 1; i < index; i++) {
                n = n.next;
            }
            temp = n.next;
            n.next = temp.next;
        }

    }

    public void deleteMiddleNode() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node start = new Node();
        start.next = head;
        Node fast = start;
        Node slow = start;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        System.out.println(slow.data);

    }

    public Node sortList(Node tempHead) {
        if (tempHead == null || tempHead.next == null) {
            return tempHead;
        }

        Node left = tempHead;
        Node mid = this.findMiddle(tempHead);
        Node right = mid.next;
        mid.next = null;

        left = this.sortList(left);
        right = this.sortList(right);

        return this.merge(left, right);
    }

    public Node getHead() {
        return head;
    }

    private Node merge(Node left, Node right) {
        Node n = new Node();
        Node tempHead = n;

        while (left != null && right != null) {
            if (left.data < right.data) {
                n.next = left;
                left = left.next;
            } else {
                n.next = right;
                right = right.next;
            }
            n = n.next;
        }

        if (left != null) {
            n.next = left;
        }
        if (right != null) {
            n.next = right;
        }
        return tempHead.next;
    }

    public Node findMiddle(Node tempHead) {

        Node fast = tempHead;
        Node slow = tempHead;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
    public Node reverse(){
        return this.reverseHelper(head);
    }
    public Node reverse(Node head){
        return this.reverseHelper(head);
    }
    public Node reverseHelper(Node head) {
        Node curr = head;
        Node prev = null;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public Node addOneToNode() {
        //   1 -> 5 -> 3
        //   1 -> 5 -> 4
        Node head = this.reverse();
        Node dummy = new Node(0);
        Node curr = dummy;
        int carry = 1;

        while(head != null || carry > 0){
            int v = head != null ? head.data : 0;

            int val = v + carry;
            carry = val  / 10;
            val = val % 10;
            curr.next = new Node(val);

            curr = curr.next;
            head = head != null ? head.next : null;
        }
        return this.reverse(dummy.next);

    }
}
