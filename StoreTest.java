import java.util.Scanner;
//the program is run, it prompts the user to enter the name of the store
// and the number of computers in the store, and then creates a new Store object
// with the specified name and number of computers.
public class StoreTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter store name: ");
        String name = scanner.nextLine();
        System.out.print("Enter number of computers in the store: ");
        int numOfComputers = scanner.nextInt();
        Store store = new Store(name, numOfComputers);
        store.createComputers();
        store.printComputerDetails();
    }
}
