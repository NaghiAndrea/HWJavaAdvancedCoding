package ex10Basket;

import java.util.Map;

public class OrderService {

    public static double totalPrice(Basket basket){
        double suma = 0;
        for (Map.Entry<Product,Integer> element : basket.retrieveItems().entrySet()){
            suma += element.getValue() * element.getKey().getPrice();
        }
       basket.emptyBasket();

        return suma;
    }

    public static double totalPrice2(Basket basket) {
     double total =
              basket.retrieveItems().entrySet().stream()
                .map(pr -> pr.getKey().getPrice() * pr.getValue())
                .reduce(0.0,(currValue,element) -> (currValue + element));
      basket.emptyBasket();
      return total;
    }
}
