package productSystem;

public class PremiumUser extends RegularUser{
    private String membershipLevel;

    public PremiumUser(String username, String membershipLevel) {
        super(username);
        this.membershipLevel = membershipLevel;
    }
    public void addProductToCart(Product product) {
         // הנחה לדוגמה
        product.price = product.price * 0.9;
        super.addProductToCart(product);
    }
//    @Override
//    public void addProductToCart(Product product) {
//        double discountedPrice = product.getPrice() * 0.9; // 10% discount
//        Product discountedProduct = new Product(product.getProductId(), product.getName(), discountedPrice)
//        {
//            @Override
//            public String getDescription() {
//                return product.getDescription() + " (Discounted)";
//            }
//        };
//        super.addProductToCart(discountedProduct);
//    }

}
