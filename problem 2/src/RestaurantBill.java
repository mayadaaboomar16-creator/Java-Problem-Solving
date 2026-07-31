import java.util.Scanner;

public class RestaurantBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter price one meal : ");
        double meal1 = input.nextDouble();
        System.out.print("Enter price two meal : ");
        double meal2 = input.nextDouble();
        System.out.print("Enter price three meal : ");
        double meal3 = input.nextDouble();
        double total = meal1 + meal2 + meal3;
        double vat = total * 0.14;
        double finalPrice = total + vat;
        System.out.println("Total Price : " + total);
        System.out.println("VAT (14%)   : " + vat);
        System.out.println("Final Price : " + finalPrice);
    }
}