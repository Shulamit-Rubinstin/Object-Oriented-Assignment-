package productSystem;

public class PremiumUser extends RegularUser{
    private String membershipLevel;

    public PremiumUser(String username, String membershipLevel) {
        super(username);
        this.membershipLevel = membershipLevel;
    }
    public void addProductToCart(Product product) {
        //10% discount
        product.price = product.price * 0.9;
        super.addProductToCart(product);
    }

}
