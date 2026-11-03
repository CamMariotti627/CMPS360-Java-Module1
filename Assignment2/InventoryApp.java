import javax.swing.JOptionPane;                                                  // imports JOptionPane class for GUI dialog boxes

public class InventoryApp {                                                      // declares class for inventory app 
    public static void main(String[] args) {                                     // main method to run inventory app
        Product product1 = new Product("12 in Print", 20.00, 4);                 // |
        Product product2 = new Product("18 in Print", 30.00, 3);                 // |- These 3 lines create 3 products with names, prices and quantities 
        Product product3 = new Product("32 in Print", 45.00, 2);                 // |

        double total = product1.calculateInventoryValue() + product2.calculateInventoryValue() + product3.calculateInventoryValue();
            // ^^ this line calculates total inventory value by adding the inventory values of all 3 products

        String line1 = product1.getName() + ": " + product1.getQuantity() + " x $" + String.format("%.2f", product1.getPrice()) + " = $" + String.format("%.2f", product1.calculateInventoryValue());

        String line2 = product2.getName() + ": " + product2.getQuantity() + " x $" + String.format("%.2f", product2.getPrice()) + " = $" + String.format("%.2f", product2.calculateInventoryValue());

        String line3 = product3.getName() + ": " + product3.getQuantity() + " x $" + String.format("%.2f", product3.getPrice()) + " = $" + String.format("%.2f", product3.calculateInventoryValue());

        // ^^ these 3 lines create summary strings foreach product's inventory, including name, quantity, price, & total inventory value.
        // String.format("%.2f", ...) is used to format the price and inventory value to 2 decimal places

        System.out.println(line1);                                                      // |
        System.out.println(line2);                                                      // |-- These lines print the inventory summary for each product 
        System.out.println(line3);                                                      // |                                  
        System.out.println("Total Inventory Value: $" + String.format("%.2f", total));
        // ^^^ this line prints the total inventory value w/ 2 decimal places

        String summary = line1 + "\n" + line2 + "\n" + line3 + "\nTotal Inventory Value: $" + String.format("%.2f", total);
        // ^^^ this line creates a summary string combining all product summaries & a total inventory value summary with 2 decimal places each
        // "\n" is used to create a new line in the dialog box for each product summary & total inventory summary value

        JOptionPane.showMessageDialog(null, summary);
        // ^^^ this line displays the summary string in a dialog box using JOptionPane
    
    }
}