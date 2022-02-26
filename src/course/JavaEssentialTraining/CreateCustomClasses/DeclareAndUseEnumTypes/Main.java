package course.JavaEssentialTraining.CreateCustomClasses.DeclareAndUseEnumTypes;

import course.JavaEssentialTraining.CreateCustomClasses.DeclareAndUseEnumTypes.model.ClothingItem;
import course.JavaEssentialTraining.CreateCustomClasses.DeclareAndUseEnumTypes.model.ClothingSize;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        var item = new ClothingItem(ClothingItem.SHIRT, ClothingSize.L, 19.99,3);

        var totalPrice = item.getPrice() * item.getQuantity();
        var formatter = NumberFormat.getCurrencyInstance();
        var output = String.format("Your %s %s order will cost %s",
                                            item.getSize(),
                                            item.getType(),
                                            formatter.format(totalPrice));
        System.out.println(output);
    }
}
