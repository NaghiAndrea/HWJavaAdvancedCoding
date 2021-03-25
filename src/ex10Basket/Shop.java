package ex10Basket;

import java.time.LocalDate;

public class Shop {
    public static void main(String[] args) {

        GenericProduct product1 = new GenericProduct("Produs1", 52.3,3, LocalDate.of(2021,3,8));
        GenericProduct product2 = new GenericProduct("Produs2", 3.5,50, LocalDate.of(2021,2,28));
        GenericProduct product3 = new GenericProduct("Produs3", 35,21, LocalDate.of(2021,3,28));
        GenericProduct product4 = new GenericProduct("Produs4", 12.3,30, LocalDate.of(2021,3,16));
        GenericProduct product5 = new GenericProduct("Produs5", 6.5,23, LocalDate.of(2021,1,8));
        GenericProduct product6 = new GenericProduct("Produs6", 3 ,300, LocalDate.of(2021,3,24));

        Basket basket = new Basket();
        System.out.println("-------------------1---------------------");
        basket.addItem(product1,2);
        basket.addItem(product5,12);
        System.out.println(basket);

        System.out.println("-------------------2---------------------");
        basket.addItem(product2,3);
        System.out.println(basket);

        System.out.println("-------------------3---------------------");
        basket.addItem(product1,3);

        System.out.println("-------------------4---------------------");
        basket.addItem(product5,8);

        System.out.println("-------------------5---------------------");
        basket.removeItem(product1,1);
        System.out.println(basket);

        System.out.println("-------------------6---------------------");
        basket.removeItem(product1,2);

        System.out.println("-------------------7---------------------");
        basket.removeItem(product1,1);
        System.out.println(basket);


        System.out.println("-------------------8---------------------");
        basket.addItem(product3,2);
        System.out.println(basket);

        System.out.println("-------------------9---------------------");

        System.out.println("Valoarea cosului este: " + OrderService.totalPrice2(basket) + " lei");
       // System.out.println("Valoarea cosului este: " + OrderService.totalPrice(basket) + " lei");

        System.out.println(basket);
    }
}
