import java.util.*;
public class AddressBook {
    List<BuddyInfo> buddyInfo;
    public AddressBook(){
        buddyInfo = new ArrayList<>();
    }
    public void addBuddy(BuddyInfo buddy){
        buddyInfo.add(buddy);
    }
    public void removeBuddy(BuddyInfo buddy){
    }

    public static void main(String[] a){
        BuddyInfo buddy = new BuddyInfo("Tom", "viking drive", "1234");
        AddressBook addressbook = new AddressBook();
        addressbook.addBuddy(buddy);
        addressbook.removeBuddy(buddy);
    }

}
