package course.JavaEssentialTraining.WorkWithInheritance.UseObjextsAsTheirSuperTypes.model;

public class Shirt extends ClothingItem {
    public Shirt(ClothingSize size, double price, int quantity) {
        super(ClothingItem.SHIRT, size, price, quantity);
    }
}
