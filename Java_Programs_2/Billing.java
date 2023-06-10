
// Program for complete billing of a store or mall.
import java.util.Scanner;

class Billing {
    public static void main(String args[]) {
        int item_num, quantity;
        float rate, amount, discount, total_amount;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the item number : ");
        item_num = s.nextInt();
        System.out.println("Enter the Rate : ");
        rate = s.nextFloat();
        System.out.println("Enter the Quantity : ");
        quantity = s.nextInt();
        amount = rate * quantity;
        if (item_num == 1) {
            if (amount >= 25000) {
                discount = amount * 40 / 100;
            } else {
                discount = amount * 20 / 100;
            }
        } else if (item_num == 2) {
            if (amount > 40000) {
                discount = amount * 50 / 100;
            } else {
                discount = amount * 30 / 100;
            }
        } else if (item_num == 3) {
            if (amount <= 20000) {
                discount = amount * 12 / 100;
            } else {
                discount = amount * 18 / 100;
            }
        } else {
            discount = amount * 10 / 100;
        }
        s.close();
        total_amount = amount - discount;
        System.out.println("Total Amount : " + amount);
        System.out.println("Total discounted amount : " + discount);
        System.out.println("Total amount have to pay : " + total_amount);
    }
}
