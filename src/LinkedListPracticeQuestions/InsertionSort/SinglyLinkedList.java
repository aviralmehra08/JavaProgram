package LinkedListPracticeQuestions.InsertionSort;
public class SinglyLinkedList
{
    Node head;
    Node tail;
    Node sorted;
    int size;
    public Node creation(int nodevalue)
    {
        head=new Node();
        Node node=new Node();
        node.value=nodevalue;
        node.next=null;
        head=node;
        tail=node;
        size=1;
        return head;
    }    
    public void insert(int location, int nodevalue)
    {
        Node node=new Node();
        node.value=nodevalue;
        if(head==null)
        {
            creation(nodevalue);
            return;
        }
        else if(location==0)
        {
            node.next=head;
            head=node;
        }
        else if(location>=size)
        {
            node.next=null;
            tail.next=node;
            tail=node;
        }
        else
        {
            Node tempNode=head;
            int index=0;
            while(index<location-1)
            {
                tempNode=tempNode.next;
                index++;
            }
            Node nextnode=tempNode.next;
            tempNode.next=node;
            node.next=nextnode;
        }
        size++;
    }
    public void insertionsort(Node newnode)
    {
        sorted=null;
        Node current=newnode;
        while(current!=null)
        {
            Node next=current.next;
            sortedInsert(current);
            current=next;
        }
        head=sorted;
    }
    public void sortedInsert(Node newnode)
    {
        if(sorted==null || sorted.value>=newnode.value)
        {
            newnode.next=sorted;
            sorted=newnode;
        }
        else
        {
            Node current=sorted;
            while(current.next!=null && current.next.value<newnode.value)
            {
                current=current.next;
            }
            newnode.next=current.next;
            current.next=newnode;
        }
    }
    public void traverse()
    {
        if(head==null)
        {
            System.out.println("SLL does not exist");
        }
        else
        {
            Node tempNode=head;
            for(int x=0;x<size;x++)
            {
                System.out.print(tempNode.value);
                if(x!=size-1)
                {
                    System.out.print("->");
                }
                tempNode=tempNode.next;
            }
        }
    }
    public static void main(String args[])
    {
        SinglyLinkedList sl=new SinglyLinkedList();
        sl.insert(0, 10);
        sl.insert(1,2);
        sl.insert(2, 9);
        sl.insert(3, 1);
        sl.insert(4, 20);
        System.out.println("Before Sorting->");
        sl.traverse();
        System.out.println("\nAfter Sorting->");
        sl.insertionsort(sl.head);
        sl.traverse();
    }
}

