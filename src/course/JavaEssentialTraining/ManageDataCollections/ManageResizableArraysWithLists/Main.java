package course.JavaEssentialTraining.ManageDataCollections.ManageResizableArraysWithLists;

import course.JavaEssentialTraining.ManageDataCollections.ManageResizableArraysWithLists.model.ClothingItem;
import course.JavaEssentialTraining.ManageDataCollections.ManageResizableArraysWithLists.model.ClothingSize;
import course.JavaEssentialTraining.ManageDataCollections.ManageResizableArraysWithLists.model.Hat;
import course.JavaEssentialTraining.ManageDataCollections.ManageResizableArraysWithLists.model.Shirt;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        List<ClothingItem> items = new ArrayList<>();
        items.add(new Shirt(ClothingSize.L,19.99, 3));
        items.add(new Hat(ClothingSize.M,24.99,1));

        for (ClothingItem item : items) {
            displayItemDetails(item);
        }

//        String[] color = new String[3];
//        color[0] = "Red";
//        color[1] = "Green";
//        color[2] = "Blue";
//        for (int i = 0; i < color.length; i++) {
//            System.out.println(color[i]);
//        }
//        ClothingItem[] items = {new Shirt(ClothingSize.L, 19.99,3),
//                                new Hat(ClothingSize.M,29.99,1)};
//
//        for (ClothingItem item : items) {
//            displayItemDetails(item);
//        }

    }

    private static void displayItemDetails(ClothingItem item) {
        var totalPrice = item.getPrice() * item.getQuantity();
        var formatter = NumberFormat.getCurrencyInstance();
        var output = String.format("Your %s %s order will cost %s",
                                            item.getSize(),
                                            item.getType(),
                                            formatter.format(totalPrice));
        System.out.println(output);
    }
}
