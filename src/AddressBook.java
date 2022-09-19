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
    }
}
