package Code.Java.MyDoublyLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MyDoublyLinkedList {
    private Node head;
    private Node tail;

    public void display() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println("end");
        System.out.println();
    }

    public void displayReverse() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node n = tail;
        while (n != null) {
            System.out.print(n.data + " -> ");
            n = n.prev;
        }
        System.out.println("start");
        System.out.println();
    }

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;

        if (head == null) {
            tail = newNode;
        } else {
            head.prev = newNode;
        }

        head = newNode;
    }

    public void insertAt(int position, int data) {

        if (position == 0) {
            insertAtStart(data);
            return;
        }

        Node newNode = new Node(data);
        Node n = head;
        for (int i = 1; i < position; i++) {
            n = n.next;
            if (n == null) {
                throw new IndexOutOfBoundsException("Invalid position");
            }
        }

        if (n == tail) {
            insetAtEnd(data);
            return;
        }

        newNode.next = n.next;
        newNode.prev = n;
        n.next.prev = newNode;
        n.next = newNode;
    }

    public void insetAtEnd(int data) {
        if (head == null) {
            insertAtStart(data);
            return;
        }

        Node newNode = new Node(data);
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    public void deleteAt(int position) {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }

        if (position == 0) {
            head = head.next;
            if (head == null) {
                tail = null;
            } else {
                head.prev = null;
            }
            return;
        }
        Node n = head;
        Node prev = null;
        try {
            for (int i = 1; i <= position; i++) {
                prev = n;
                n = n.next;
                if (n == null) {
                    throw new IndexOutOfBoundsException("Invalid position");
                }
            }
            System.out.println(n.data);
            assert prev != null;
            prev.next = n.next;
            if (n.next == null) {
                tail = prev;
            } else {
                n.next.prev = prev;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Cant delete. Position out of range");
        }


    }

    public void findPair(int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        Node n = head;

        while (n != null) {
            if (map.containsKey(k - n.data)) {
                res.add(new ArrayList<>(Arrays.asList(k - n.data, n.data)));
            }
            int count = map.getOrDefault(n.data, 0);
            map.put(n.data, count + 1);
            n = n.next;
        }

        System.out.println(res);
    }

    public void uniqueSortedList() {
        Node prev = head;
        Node curr = head.next;

        while (curr != null) {
            if (prev.data == curr.data) {
                prev.next = curr.next;
                if (curr.next != null) {
                    curr.next.prev = prev;
                }
            } else if (curr.next == null && curr.data == prev.data) {
                prev.next = null;
            } else if (curr.data != prev.data) {
                prev = prev.next;
            }
            curr = curr.next;
        }
    }

    public void reverse() {
        Node temp = new Node();
        Node curr = head;

        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        if (temp != null) {
            head = temp.prev;
        }
    }

    public void sortUsingMergeSort() {
        head = mergeSort(head);
    }

    private Node mergeSort(Node tempHead) {
        if(tempHead == null || tempHead.next == null){
            return tempHead;
        }

        Node left = tempHead;
        Node mid = findMiddle(tempHead);
        Node right = mid.next;
        mid.next = null;
        right.prev = null;

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private Node merge(Node left, Node right) {
        if(left == null){
            return right;
        }
        if(right == null){
            return left;
        }
        Node ans = new Node();
        Node temp = ans;

        while(left != null && right != null){
            if(left.data < right.data){
                temp.next = left;
                left.prev = temp;
                temp = left;
                left = left.next;
            }else{
                temp.next = right;
                right.prev = temp;
                temp = right;
                right = right.next;
            }
        }

        if (left != null) {
            temp.next = left;
            left.prev = temp;
            temp = left;
            left = left.next;
        }
        if (right != null) {
            temp.next = right;
            right.prev = temp;
            temp = right;
            right = right.next;
        }

        ans = ans.next;
        ans.prev = null;
        return ans;
    }

    private Node findMiddle(Node tempHead) {
        Node fast = tempHead;
        Node slow = tempHead;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public void reverseKGroupStriver(int K) {
        if(K == 1 || head == null){
            return;
        }

        Node dummy = new Node();
        dummy.next = head;

        Node prev = dummy;
        Node curr = dummy;
        Node next;

        int count = 0;

        while(curr.next != null){
            curr = curr.next;
            count++;
        }

        while(count >= K){
            curr = prev.next;
            next = curr.next;

            for (int i = 1; i < K; i++) {
                curr.next = next.next;
                next.next = prev.next;
                prev.next = next;
                next = curr.next;
            }

            prev = curr;
            count -= K;

        }

        head = dummy.next;
        display();
    }

    public void reverseKGroupNeetCode(int K) {
        Node dummy = new Node();
        dummy.next = head;

        Node groupPrev = dummy;

        while(true){
            Node kth = getKthNode(groupPrev, K);

            if(kth == null){
                break;
            }

            Node groupNext = kth.next;
            Node prev = kth.next;
            Node curr = groupPrev.next;

            while(curr != groupNext){
                Node temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            Node temp = groupPrev.next;
            groupPrev.next = kth;
            groupPrev = temp;

        }

        head = dummy.next;
        display();
    }

    private Node getKthNode(Node curr, int k){
        while(curr != null && k > 0){
            curr = curr.next;
            k-=1;
        }
        return curr;
    }
}
