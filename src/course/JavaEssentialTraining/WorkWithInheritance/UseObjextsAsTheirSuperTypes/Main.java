package course.JavaEssentialTraining.WorkWithInheritance.UseObjextsAsTheirSuperTypes;

import course.JavaEssentialTraining.WorkWithInheritance.UseObjextsAsTheirSuperTypes.model.ClothingItem;
import course.JavaEssentialTraining.WorkWithInheritance.UseObjextsAsTheirSuperTypes.model.ClothingSize;
import course.JavaEssentialTraining.WorkWithInheritance.UseObjextsAsTheirSuperTypes.model.Hat;
import course.JavaEssentialTraining.WorkWithInheritance.UseObjextsAsTheirSuperTypes.model.Shirt;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        var item = new Shirt(ClothingSize.L, 19.99,3);

        displayItemDetails(item);

        var hat = new Hat(ClothingSize.M,29.99,1);

        displayItemDetails(hat);
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
