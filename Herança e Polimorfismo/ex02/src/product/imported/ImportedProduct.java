package product.imported;

import product.Product;

public class ImportedProduct extends Product {
    
    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double totalPrice() {
        return getPrice() + customsFee;
    }

    @Override
    public final String priceTag() {
        return String.format("%s - $ %.2f (Customs fee: $ %.2f)", getName(), totalPrice(), customsFee);
    }
}
