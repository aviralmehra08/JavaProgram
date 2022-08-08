public class SinglyLinkedList
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
    public void insertion(int nodevalue, int location)
    {
        Node node=new Node();
        node.value=nodevalue;
        if(head==null)
        {
            creation(nodevalue);
            return;
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
            }
            Node nextnode=tempNode.next;
            tempNode.next=node.next;
            node.next=nextnode;
        }
        size++;
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
        sl.insertion(0, 1);
        sl.insertion(1, 2);
        sl.insertion(2, 3);
        sl.insertion(3, 4);
        sl.traverse();
    }
}
