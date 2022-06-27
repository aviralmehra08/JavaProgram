package LinkedListPracticeQuestions;

public class MyLinkedList
{
    public class Node
    {
        public int value;
        public Node next;
        public Node(int value)
        {
            this.value=value;
            this.next=null;
        }
    }    
    public Node head;
    public Node tail;
    public int size;
    public MyLinkedList()
    {

    }
    public int get(int index)
    {
        if(index>=size)
        {
            return -1;
        }
        Node current=head;
        for(int x=0;x<index;x++)
        {
            current=current.next;
        }
        return current.value;
    }
    public void addAtHead(int value)
    {
        Node node=new Node(value);
        node.value=value;
        size++;
        if(head==null)
        {
            head=node;
            return;
        }
        node.next=head;
        head=node;
    }
    public void addAtTail(int value)
    {
        Node node=new Node(value);
        node.value=value;
        size++;
        if(head==null)
        {
            head=node;
            return;
        }
        Node current=head;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=node;
    }
    public void addAtIndex(int index,int value)
    {
        if(index>size)
        {
            return;
        }
        if(index==0)
        {
            addAtHead(value);
        }
        else
        {
            size++;
            Node node=new Node(value);
            node.value=value;
            Node current=head;
            for(int x=0;x<index-1;x++)
            {
                current=current.next;
            }
            node.next=current.next;
            current.next=node;
        }
    }
    public void deleteAtIndex(int index)
    {
        if(index>=size)
        {
            return;
        }
        size--;
        if(index==0)
        {
            head=head.next;
        }
        else
        {
            Node current=head;
            for(int x=0;x<index-1;x++)
            {
                current=current.next;
            }
            current.next=current.next.next;
        }
    }
    public static void main(String args[])
    {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
        myLinkedList.get(1);              // return 2
        myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
        myLinkedList.get(1);              // return 3
    }
}
