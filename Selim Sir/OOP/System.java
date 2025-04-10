import java.util.ArrayList;
import java.util.Scanner;
class DirectoryEntry {
    private String name;
    private String address;
    private String telephoneNumber;
    private String mobileNumber;
    private String headOfFamily;
    private String uniqueID;
    public DirectoryEntry(String name, String address, String telephoneNumber, String mobileNumber, String headOfFamily,
            String uniqueID) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.mobileNumber = mobileNumber;
        this.headOfFamily = headOfFamily;
        this.uniqueID = uniqueID;
    }
    public String getUniqueID() {
        return uniqueID;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Telephone Number: " + telephoneNumber);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Head of Family: " + headOfFamily);
        System.out.println("Unique ID: " + uniqueID);
    }
    public boolean containsKeyword(String keyword) {
        return name.contains(keyword) || address.contains(keyword) || telephoneNumber.contains(keyword)
                || mobileNumber.contains(keyword) || headOfFamily.contains(keyword) || uniqueID.contains(keyword);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getTelephoneNumber() {
        return telephoneNumber;
    }
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getHeadOfFamily() {
        return headOfFamily;
    }
    public void setHeadOfFamily(String headOfFamily) {
        this.headOfFamily = headOfFamily;
    }
}
public class Directory {
    private ArrayList<DirectoryEntry> entries;
    public Directory() {
        entries = new ArrayList<>();
    }
    public void addEntry(String name, String address, String telephoneNumber, String mobileNumber, String headOfFamily,
            String uniqueID) {
        entries.add(new DirectoryEntry(name, address, telephoneNumber, mobileNumber, headOfFamily, uniqueID));
        System.out.println("Entry added successfully.");
    }
    public void editEntry(String uniqueID, String newName, String newAddress, String newTelephoneNumber,
            String newMobileNumber, String newHeadOfFamily) {
        boolean found = false;
        for (DirectoryEntry entry : entries) {
            if (entry.getUniqueID().equals(uniqueID)) {
                System.out.println("Original Information:");
                entry.displayInfo();
                entry.setName(newName);
                entry.setAddress(newAddress);
                entry.setTelephoneNumber(newTelephoneNumber);
                entry.setMobileNumber(newMobileNumber);
                entry.setHeadOfFamily(newHeadOfFamily);
                System.out.println("Updated Information:");
                entry.displayInfo();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Entry with Unique ID " + uniqueID + " not found.");
        }
    }
    public void searchByKeyword(String keyword) {
        boolean found = false;
        for (DirectoryEntry entry : entries) {
            if (entry.containsKeyword(keyword)) {
                entry.displayInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching entry found for keyword: " + keyword);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Directory directory = new Directory();
        char choice = 'y';
        while (choice == 'y') {
            System.out.println("\nMenu:");
            System.out.println("1. Add Entry");
            System.out.println("2. Edit Entry");
            System.out.println("3. Search by Keyword");
            System.out.print("Enter your choice: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter Telephone Number: ");
                    String telephoneNumber = scanner.nextLine();
                    System.out.print("Enter Mobile Number: ");
                    String mobileNumber = scanner.nextLine();
                    System.out.print("Enter Head of Family: ");
                    String headOfFamily = scanner.nextLine();
                    System.out.print("Enter Unique ID: ");
                    String uniqueID = scanner.nextLine();
                    directory.addEntry(name, address, telephoneNumber, mobileNumber, headOfFamily, uniqueID);
                    break;
                case 2:
                    System.out.print("Enter Unique ID of entry to edit: ");
                    String editID = scanner.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter New Address: ");
                    String newAddress = scanner.nextLine();
                    System.out.print("Enter New Telephone Number: ");
                    String newTelephoneNumber = scanner.nextLine();
                    System.out.print("Enter New Mobile Number: ");
                    String newMobileNumber = scanner.nextLine();
                    System.out.print("Enter New Head of Family: ");
                    String newHeadOfFamily = scanner.nextLine();
                    directory.editEntry(editID, newName, newAddress, newTelephoneNumber, newMobileNumber,
                            newHeadOfFamily);
                    break;
                case 3:
                    System.out.print("Enter Keyword to search: ");
                    String keyword = scanner.nextLine();
                    directory.searchByKeyword(keyword);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
            System.out.print("\nDo you want to continue? (yes-y / no-n): ");
            choice = scanner.next().charAt(0);
            scanner.nextLine();
        }
    }
}
