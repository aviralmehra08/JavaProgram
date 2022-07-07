import java.util.ArrayList;
import java.util.*;
public class MobilePhone
{
    private static Scanner scanner=new Scanner(System.in);
    private static MobilePhone mobilePhone=new MobilePhone("7525810227");
    private String myNumber;
    private ArrayList<Contact> myContacts;
    public MobilePhone(String myNumber)
    {
        this.myNumber=myNumber;
        this.myContacts=new ArrayList<Contact>();
    }    
    public boolean addNewContact(Contact contact)
    {
        if(findContact(contact.getName())>=0)
        {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }
    public boolean updateContact(Contact oldContact, Contact newContact)
    {
        int foundPosition=findContact(oldContact);
        if(foundPosition<0)
        {
            System.out.println(oldContact.getName()+", was not found");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName()+", was replaced with "+newContact.getName());
        return true;
    }
    public boolean removeContact(Contact contact)
    {
        int foundPosition=findContact(contact);
        if(foundPosition<0)
        {
            System.out.println(contact.getName()+", was not found");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName()+", was deleted");
        return true;
    }
    private int findContact(Contact contact)
    {
        return this.myContacts.indexOf(contact);
    }
    private int findContact(String contactName)
    {
        for(int x=0;x<this.myContacts.size();x++)
        {
            Contact contact=this.myContacts.get(x);
            if(contact.getName().equals(contactName))
            {
                return x;
            }
        }
        return -1;
    }
    public String queryContact(Contact contact)
    {
        if(findContact(contact)>=0)
        {
            return contact.getName();
        }
        return null;
    }
    private static void smartPhone()
    {
        System.out.println("Starting phone.....");
    }
    private static void printActions()
    {
        System.out.println("\nAvailable actions:\nPress");
        System.out.println("0 - to shutdown\n"+
                           "1 - to print contacts\n"+
                           "2 - to add a new contact\n"+
                           "3 - to update an existing contact\n"+
                           "4 - to remove an existing contact\n"+
                           "5 - query if an existing contact exists\n"+
                           "6 - to print a list of available contacts\n");
        System.out.println("Choose your actions: ");
    }
    public void printContacts()
    {
        System.out.println("Contact List");
        for(int x=0;x<this.myContacts.size();x++)
        {
            System.out.println((x+1)+"."+this.myContacts.get(x).getName()+"--->"
            +this.myContacts.get(x).getPhoneNumber());
        }
    }
    private static void addNewContact()
    {
        System.out.println("Enter new contact name: ");
        String name=scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone=scanner.nextLine();
        Contact newContact=Contact.createContact(name, phone);
        if(mobilePhone.addNewContact(newContact))
        {
            System.out.println("New Contact added: name = "+name+", phone = "+phone);
        }
        else
        {
            System.out.println("Cannot add, "+name+" already on file");
        }
    }
    public Contact queryContact(String name)
    {
        int position=findContact(name);
        if(position>=0)
        {
            return this.myContacts.get(position);
        }
        return null;
    }
    public static void updateContact()
    {
        System.out.println("Enter existing contact name: ");
        String name=scanner.nextLine();
        Contact existingContactRecord=mobilePhone.queryContact(name);
        if(existingContactRecord==null)
        {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName=scanner.nextLine();
        System.out.println("Enter new contact phone number:");
        String newNumber=scanner.nextLine();
        Contact newContact=Contact.createContact(newName, newNumber);
        if(mobilePhone.updateContact(existingContactRecord, newContact))
        {
            System.out.println("Sucessfully Updated Record");
        }
        else
        {
            System.out.println("Error Updating Record");
        }
    }
    public static void removeContact()
    {
        System.out.println("Enter existing contact name: ");
        String name=scanner.nextLine();
        Contact existingContactRecord=mobilePhone.queryContact(name);
        if(existingContactRecord==null)
        {
            System.out.println("Contact not found");
            return;
        }
        if(mobilePhone.removeContact(existingContactRecord))
        {
            System.out.println("Sucessfully Deleted");
        }
        else
        {
            System.out.println("Error deleting Contact");
        }
    }
    public static void queryContact()
    {
        System.out.println("Enter existing contact name: ");
        String name=scanner.nextLine();
        Contact existingContactRecord=mobilePhone.queryContact(name);
        if(existingContactRecord==null)
        {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: "+existingContactRecord.getName()+" phone number is "+existingContactRecord.getPhoneNumber());
    }
    public static void main(String args[])
    {
        boolean quit=false;
        smartPhone();
        printActions();
        while(!quit)
        {
            System.out.println("\nEnter action: (6 to show avaiable actions)");
            int action=scanner.nextInt();
            scanner.nextLine();
            switch(action)
            {
                case 0:
                        System.out.println("Shutting Down");
                        quit=true;
                        break;
                case 1: 
                        mobilePhone.printContacts();
                        break;
                case 2:
                        addNewContact();
                        break;
                case 3:
                        updateContact();
                        break;
                case 4:
                        removeContact();
                        break;
                case 5:
                        queryContact();
                        break;
                case 6: printActions();
                        break; 
            }
        }
    }
}
