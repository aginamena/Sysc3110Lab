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
        buddyInfo.remove(buddy);
    }
    public int getIndex(BuddyInfo buddy){
        return buddyInfo.indexOf(buddy);
    }

    public static void main(String[] a){
        BuddyInfo buddy = new BuddyInfo("Tom", "viking drive", "1234");
        BuddyInfo buddy2 = new BuddyInfo("Tom", "viking drive", "1234");
        BuddyInfo buddy3 = new BuddyInfo("Tom", "viking drive", "1234");
        AddressBook addressbook = new AddressBook();
        addressbook.addBuddy(buddy);
        addressbook.addBuddy(buddy2);
        addressbook.addBuddy(buddy3);
        addressbook.removeBuddy(buddy2);
    }

}
