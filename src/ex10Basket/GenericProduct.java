package ex10Basket;

import java.time.LocalDate;
import java.time.Period;

public class GenericProduct implements Product{
    private String productName;
    private double price;
    private double quantity;
    private LocalDate whenAvailable;

    public GenericProduct(String productName, double price, double quantity, LocalDate whenAvailable) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.whenAvailable = whenAvailable;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public boolean isAvailable(LocalDate providedDate) {
        return (Period.between(providedDate,whenAvailable).getDays() <= 0) && (quantity > 0);
    }

    public double getQuantity(){
        return quantity;
    }

    public void setQuantity(double quantity){
       this.quantity += quantity;
    }

    @Override
    public String toString() {
        return "Produsul: " + productName + " - Pret: " + price + " lei";
    }
}
