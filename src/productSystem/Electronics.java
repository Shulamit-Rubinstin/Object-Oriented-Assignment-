package productSystem;

public class Electronics extends Product{
    private int warrantyPeriod;

    public Electronics(String productId, String name, double price, int warrantyPeriod) {
        super(productId, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public String getDescription() {
        return "Electronics: productId "+getProductId()+", name " + getName() + ", price "+getPrice()+"$, Warranty: " + warrantyPeriod + " months";
    }
}


