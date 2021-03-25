package ex10Basket;

import java.time.LocalDate;
import java.util.Date;

public interface Product {
    double getPrice();
    boolean isAvailable(LocalDate providedDate);
}
