package LinkedListPracticeQuestions.BinarySearch;

public class LinkedList
{
    Node head;
    Node tail;
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
    public static Node middleNode(Node head, Node tail)
    {
        Node f=head;
        Node s=head;
        while(f.next!=null && f.next.next!=null)
        {
            f=f.next.next;
            s=s.next;
        }
        return s;
    }
    public static Node binarySearch(Node head, int value)
    {
        Node start=head;
        Node end=null;
        do
        {
            Node mid=middleNode(start, end);
            if(mid==null)
            {
                return mid;
            }
            else if(mid.value>value)
            {
                start=mid.next;
            }
            else
            {
                end=mid;
            }
        }while(end!=null || end!=start);
        return null;
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
        LinkedList l=new LinkedList();
        l.insert(0, 1);
        l.insert(1, 2);
        l.insert(2, 3);
        l.insert(3, 4);
        l.insert(4, 5);
        l.traverse();
        if(binarySearch(l.head,4)==null)
        {
            System.out.println("Value not present");
        }
        else
        {
            System.out.println("Value present");
        }
    }
}
