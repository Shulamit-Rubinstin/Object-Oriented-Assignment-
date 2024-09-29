package productSystem;

import java.util.List;

public class ECommerceSystem {
    public static void main(String[] args) {
        // יצירת מוצרים
        Product phone = new Electronics("P001", "cell phone", 699.99, 2);
        Product jacket = new Clothing("C001", "Jacket", 49.99, "M");
        Product kettle = new Electronics("P002", "kettle", 1200.00, 3);
        Product tshirt = new Clothing("C002", "T-Shirt", 19.99, "L");

        // יצירת משתמשים
        User premiumUser = new PremiumUser("Kobi Meir", "Gold");
        User regularUser1 = new RegularUser("Shulamit_Meir");
        User regularUser2 = new RegularUser("Yael_Frank");


        // הוספת מוצרים לעגלות
        regularUser1.addProductToCart(phone);
        regularUser1.addProductToCart(tshirt);

        regularUser2.addProductToCart(kettle);

        premiumUser.addProductToCart(jacket);
        premiumUser.addProductToCart(phone);

        // הצגת תוכן עגלת הקניות של כל המשתמשים (כולל הנחות במידת הצורך)
        System.out.println(regularUser1.getUsername() + "'s cart:");
        displayCart(regularUser1);

        System.out.println("\n" + regularUser2.getUsername() + "'s cart:");
        displayCart(regularUser2);

        System.out.println("\n" + premiumUser.getUsername() + "'s cart:");
        displayCart(premiumUser);

    }

    // מתודה להצגת תוכן העגלה, כולל הצגת הנחה למשתמשי פרימיום
    public static void displayCart(User user) {
        List<Product> cart = user.getCartContents();
        for (Product product : cart) {
            System.out.println(product.getDescription() );
        }
    }
}
