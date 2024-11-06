

package evergreenstore;

import java.util.*;

public class EvergreenStore {
        
    public static void main(String[] args) {
        
        Scanner scanbot = new Scanner(System.in), scanbot1 = new Scanner(System.in);
        double  discount;
        String  prodName, suppName, loc, exp, yw;
        int     prodCode, stock, price, sold, threshold;
        
        
            System.out.print("Enter the product name: ");
                prodName = scanbot1.nextLine();
                
            System.out.print("Enter the product code: ");
                prodCode = scanbot.nextInt();
                
            System.out.print("Enter the quantity in stock: ");
                stock = scanbot.nextInt();
                
            System.out.print("Enter the price per unit: ");
                price = scanbot.nextInt();
                
            System.out.print("Enter the supplier name: ");
                suppName = scanbot1.nextLine();
                
            System.out.print("Enter the production expiration date (dd-mm-yyyy): ");
                exp = scanbot1.next();
                
            System.out.print("Enter the products sold today: ");
                sold = scanbot.nextInt();
                
                
            System.out.print("Enter the discount percentage: ");
                discount = scanbot.nextDouble();
                
            System.out.print("Enter the reorder threshold quantity: ");
                threshold = scanbot.nextInt();
            
            System.out.print("Enter the store location: ");
                loc = scanbot1.nextLine();
                scanbot1.next();
            
            System.out.println("\n");
            
            System.out.println("Product name: " + prodName + "\n" + "Product code: " 
                    + prodCode + "\n" + "Quantity in stock: " + stock + "\n" 
                    + "Price per unit: " + price + "\n" + "Supplier name: " + suppName 
                    + "\n" + "Expiration date: " + exp + "\n" + "Products sold today: " 
                    + sold + "\n" + "Discount percentage: " + discount + "\n" 
                    + "Reorder threshold quantity: " + threshold + "\n" + "Store location: " + loc);
            
        }
}
    

