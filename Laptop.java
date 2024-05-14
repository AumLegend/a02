

import java.util.Scanner;

public class Laptop implements ComputerInterface {
    String company;
    float price;
    float taxRate = 0.13f;
    float discountRate;
    String color;

    public Laptop() {
        this.taxRate = 0.13f;
    }

    public void readDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter company name: ");
        this.company = scanner.nextLine();
        System.out.print("Enter color: ");
        this.color = scanner.nextLine();
        System.out.print("Enter price: ");
        this.price = scanner.nextFloat();
        System.out.print("Enter offer percentage(from 0.1 to 0.5): ");
        this.discountRate = scanner.nextFloat();
    }
//this method calculates and returns the final price of the computer, including discounts and taxes.
    public float findFinalPrice() {
        return this.price*(1-this.discountRate)*(1+this.taxRate);
    }

    public void printDetails(float finalPrice) {
        System.out.printf("%s has one %s colored %s Laptop . Price: $%.2f\n", this.owner, this.color, this.company, finalPrice);
    }
}