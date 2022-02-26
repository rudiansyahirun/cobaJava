package course.JavaEssentialTraining.ManageDataCollections.StoreValuesInSimpleArrays;

import course.JavaEssentialTraining.ManageDataCollections.StoreValuesInSimpleArrays.model.ClothingItem;
import course.JavaEssentialTraining.ManageDataCollections.StoreValuesInSimpleArrays.model.ClothingSize;
import course.JavaEssentialTraining.ManageDataCollections.StoreValuesInSimpleArrays.model.Hat;
import course.JavaEssentialTraining.ManageDataCollections.StoreValuesInSimpleArrays.model.Shirt;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {

        String[] color = new String[3];
        color[0] = "Red";
        color[1] = "Green";
        color[2] = "Blue";
        for (int i = 0; i < color.length; i++) {
            System.out.println(color[i]);
        }
        ClothingItem[] items = {new Shirt(ClothingSize.L, 19.99,3),
                                new Hat(ClothingSize.M,29.99,1)};

//        var item = new Shirt(ClothingSize.L, 19.99,3);

//        displayItemDetails(item);

//        var hat = new Hat(ClothingSize.M,29.99,1);

//        displayItemDetails(hat);
        for (ClothingItem item : items) {
            displayItemDetails(item);
        }

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
