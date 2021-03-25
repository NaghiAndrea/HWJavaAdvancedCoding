package ex10Basket;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Basket {
    private Map<Product, Integer> itemList;

    public Basket() {
        itemList = new HashMap<>();
    }
//&& itemList.get(item) + quant <= item.getQuantity())
    public boolean addItem(GenericProduct item, int quant) {
        if (itemList.containsKey(item) && quant <= item.getQuantity()) {
            int newQuantity = itemList.get(item) + quant;
            itemList.put(item, newQuantity);
            item.setQuantity(-quant);
            return true;
        }
        if (item.getQuantity() > quant && item.isAvailable(LocalDate.now())) {
            itemList.put(item, quant);
            item.setQuantity(-quant);
            return true;
        }
        System.out.println("Nu s-a putut adauga produsul la cos!");
        return false;
    }

    public boolean removeItem(GenericProduct item, int quant) {
        if (itemList.containsKey(item)) {
            if (itemList.get(item) > quant) {
                item.setQuantity(quant);
                itemList.put(item, itemList.get(item) - quant);
                return true;
            } else if (itemList.get(item) == quant) {
                itemList.remove(item);
                return true;
            }
        }
        System.out.println("Nu s-a putut efectua stergerea produsului.");
        return false;
    }

    public Map<Product, Integer> retrieveItems() {
        return itemList;
    }

    public void emptyBasket() {
        itemList = new HashMap<>();
    }

    @Override
    public String toString() {
        if (itemList.size() == 0) {
            return "Cosul este gol.";
        }
        String itemListString = "Cosul: \n   ";
        for (Map.Entry<Product, Integer> element : itemList.entrySet()) {
            itemListString += element.getKey().toString() + " - Cantitate comandata: " + element.getValue() + " \n   ";
        }
        return itemListString;
    }
}
