package course.JavaEssentialTraining.CreateCustomClasses.UseStaticFieldAsConstants;

import course.JavaEssentialTraining.CreateCustomClasses.UseStaticFieldAsConstants.model.ClothingItem;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        var item = new ClothingItem(ClothingItem.SHIRT, "M", 19.99,3);

        var totalPrice = item.getPrice() * item.getQuantity();
        var formatter = NumberFormat.getCurrencyInstance();
        var output = String.format("Your %s order will cost %s",
                                            item.getType(),
                                            formatter.format(totalPrice));
        System.out.println(output);
    }
}
