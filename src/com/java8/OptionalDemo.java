package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        List<Item> itemList = new ArrayList<>();
        Item i10 = new Item(10, "Soap");
        Item i12 = new Item(12, "Tooth brush");
        Item i15 = new Item(15, "Suger");
        Item i18 = new Item(18, "Rice");
        itemList.add(i10);
        itemList.add(i12);
        itemList.add(i15);
        itemList.add(i18);

        //searching
        Item item = new Item();
//        Optional<Item> searchedItem = item.getItem(15, itemList);
        String name = item.getItem(15, itemList).map(e->e.getItemName() + " :this is your item").orElse("none");
//        String name = searchedItem.orElseGet(()->new Item(0, "No such item present..")).getItemName();
        System.out.println(name);
//        System.out.println("Item Name: " + searchedItem.orElse(new Item(0, "none")).getItemName());
    }
}

class Item{
    private Integer itemId;
    private String itemName;

    Item(){

    }
    Item(Integer itemId, String itemName){
        this.itemId=itemId;
        this.itemName=itemName;
    }

    public Integer getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                '}';
    }

    public Optional<Item> getItem(Integer itemId, List<Item> items){
        return items.stream().filter(e->e.getItemId().equals(itemId)).findFirst();
    }
}
