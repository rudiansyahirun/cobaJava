package course.JavaEssentialTraining.WorkWithInheritance.ExtendClassesAndOverrideMethods;

import course.JavaEssentialTraining.WorkWithInheritance.ExtendClassesAndOverrideMethods.model.ClothingSize;
import course.JavaEssentialTraining.WorkWithInheritance.ExtendClassesAndOverrideMethods.model.Shirt;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        var item = new Shirt(ClothingSize.L, 19.99,3);

        var totalPrice = item.getPrice() * item.getQuantity();
        var formatter = NumberFormat.getCurrencyInstance();
        var output = String.format("Your %s %s order will cost %s",
                                            item.getSize(),
                                            item.getType(),
                                            formatter.format(totalPrice));
        System.out.println(output);
    }
}
