import java.util.*;
public class AddressBook {
    private ArrayList<BuddyInfo> BuddyList; //Array list of buddyInfo Objects

    public AddressBook(){ //constructor
        BuddyList = new ArrayList<BuddyInfo>();
    }
    public void addBuddy(BuddyInfo Buddy){ //method to add buddy
        BuddyList.add(Buddy);
    }
    public void removeBuddy(BuddyInfo Buddy){ //method to remove buddy
        BuddyList.remove(Buddy);
    }
    public static void main(String[] args){
        System.out.println("AddressBook");
        BuddyInfo buddy= new BuddyInfo("Jad", "Carleton", "6137203334");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
