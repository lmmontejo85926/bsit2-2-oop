import java.util.ArrayList;
import java.util.List;

public abstract class User {
    private String userId;
    private String name;
    private String email;
    private ArrayList<LibraryItem> borrowedItems;

    public User(String userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.borrowedItems = new ArrayList<>();
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getBorrowedItemsCount() {
        return borrowedItems.size();
    }

    public void addBorrowedItem(LibraryItem item) {
        borrowedItems.add(item);
    }

    public void removeBorrowedItem(LibraryItem item) {
        borrowedItems.remove(item);
    }

    public void displayBorrowedItems() {
        if (borrowedItems.isEmpty()) {
            System.out.println(name + " has no borrowed items.");
            return;
        }
        System.out.println(name + "'s borrowed items:");
        for (LibraryItem it : borrowedItems) {
            System.out.println("  - " + it.getItemInfo());
        }
    }

    public abstract int getMaxBorrowLimit();
}
