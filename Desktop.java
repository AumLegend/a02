import java.util.Scanner;

public class Desktop implements ComputerInterface {
    String company;
    float price;
    float taxRate = 0.13f;

    public Desktop() {
        this.taxRate = 0.13f;
    }
//his method prompts the user to enter the details for a new computer.
    public void readDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter company name: ");
        this.company = scanner.nextLine();
        System.out.print("Enter price: ");
        this.price = scanner.nextFloat();
    }
//this method calculates and returns the final price of the computer, including taxes.
    public float findFinalPrice() {
        return this.price*(1+this.taxRate);
    }
// this method prints the details of the computer object, including the name of the owner, the name of the company, and the final price of the computer.
    public void printDetails(float finalPrice) {
        System.out.printf("%s has one %s Desktop. Price: $%.2f\n", this.owner, this.company, finalPrice);
    }
}
