import java.util.ArrayList;
import java.util.*;
public class GroceryList
{
    public ArrayList<String> groceryList=new ArrayList<String>();
    public static GroceryList grocerylist=new GroceryList(); 
    public static Scanner scanner=new Scanner(System.in);   
    public void addGroceryList(String item)
    {
        groceryList.add(item);
    }
    public void printGroceryList()
    {
        System.out.println("You have "+groceryList.size()+" items in your grocery list");
        for(int x=0;x<groceryList.size();x++)
        {
            System.out.println((x+1)+". "+groceryList.get(x));
        }
    }
    public void modifyGroceryItem(int position, String item)
    {
        groceryList.set(position, item);
        System.out.println("Grocery item "+(position+1)+" has been modified");
    }
    public void removeGroceryList(int position)
    {
        String item=groceryList.get(position);
        groceryList.remove(position);
    }
    public String findItem(String searchItem)
    {
        //boolean item=groceryList.contains(searchItem);
        int position=groceryList.indexOf(searchItem);
        if(position>=0)
        {
            return groceryList.get(position);
        }
        return null;
    }
    public static void printInstructions()
    {
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application");
    }
    public static void addItem()
    {
        System.out.print("Please enter the grocery item: ");
        grocerylist.addGroceryList(scanner.nextLine());
    }
    public static void modifyItem()
    {
        System.out.print("Enter item number: ");
        int itemNo=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem=scanner.nextLine();
        grocerylist.modifyGroceryItem(itemNo-1, newItem);
    }
    public static void removeItem()
    {
        System.out.print("Enter item number: ");
        int itemNo=scanner.nextInt();
        scanner.nextLine();
        grocerylist.removeGroceryList(itemNo-1);
    }
    public static void searchForItem()
    {
        System.out.print("Item to search for: ");
        String searchItem=scanner.nextLine();
        if(grocerylist.findItem(searchItem)!=null)
        {
            System.out.println("Found "+searchItem+" in our grocery list");
        }
        else
        {
            System.out.println(searchItem+" not found in our grocery list");
        }
    }
    public static void main(String args[])
    {
        boolean quit=false;
        int choice=0;
        printInstructions();
        while(!quit)
        {
            System.out.println("Enter your choice");
            choice=scanner.nextInt();
            scanner.nextLine();
            switch(choice)
            {
                case 0: printInstructions();
                        break;
                case 1: grocerylist.printGroceryList();
                        break;
                case 2: addItem();
                        break;
                case 3: modifyItem();
                        break;
                case 4: removeItem();
                        break;
                case 5: searchForItem();
                        break;
                case 6: quit=true;
                        break;
            }
        }
    }
}
