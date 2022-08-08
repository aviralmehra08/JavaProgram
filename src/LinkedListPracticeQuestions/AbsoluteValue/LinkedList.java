package LinkedListPracticeQuestions.AbsoluteValue;


public class LinkedList
{
    static Node head;
    Node tail;
    int size;
    public Node creation(int nodevalue)
    {
        head=new Node();
        Node node=new Node();
        node.next=null;
        node.value=nodevalue;
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
    public Node absolute(Node head)
    {
        Node prev=head;
        Node curr=head.next;
        while(curr!=null)
        {
            if(curr.value<prev.value)
            {
                prev.next=curr.next;
                curr.next=head;
                head=curr;
                curr=prev;
            }
            else
            {
                prev=curr;
            }
            curr=curr.next;
        }
        return head;
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
        l.insert(0, 0);
        l.insert(1, 1);
        l.insert(2, -2);
        l.insert(3, 3);
        l.insert(4, 4);
        l.insert(5, 5);
        l.insert(6, -5);
        l.traverse();
        LinkedList.head=l.absolute(head);
        System.out.println("\n");
        l.traverse();
    }
}
