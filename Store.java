//import Arralist and Scanner
import java.util.ArrayList;
import java.util.Scanner;

public class Store {
   //declare variables here
    String name;
    int numOfComputers;
    ArrayList<ComputerInterface> computers = new ArrayList<>();
//made a constructor here
    public Store(String name, int numOfComputers) {
        this.name = name;
        this.numOfComputers = numOfComputers;
    }
//with the use of for,if and else , create two conditions for two diffrent cases, and it will select on what user will input
    public void createComputers() {
        for(int i=0; i<this.numOfComputers; i++) {
            System.out.println("1. Desktop\n2. Laptop");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if(choice == 1) {
                Desktop desktop = new Desktop();
                desktop.readDetails();
                this.computers.add(desktop);
            } else if(choice == 2) {
                Laptop laptop = new Laptop();
                laptop.readDetails();
                this.computers.add(laptop);
            } else {
                System.out.println("Not a valid input , try again");
                i--;
            }
        }
    }
//When called, this method will print out the details of the computers in the store's inventory.
    public void printComputerDetails() {
        System.out.printf("\nDetails of %s Store\n", this.name);
        System.out.println("*************************************************************************");
        for(int i=0; i<this.numOfComputers; i++) {
            float finalPrice = computers.get(i).findFinalPrice();
            computers.get(i).printDetails(finalPrice);
        }
    }
}