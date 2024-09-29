package productSystem;

import java.util.List;

public interface User {
    String getUsername();
    void addProductToCart(Product product);
    List<Product> getCartContents();
}
