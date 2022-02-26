package course.JavaEssentialTraining.WorkWithInheritance.UseObjextsAsTheirSuperTypes.model;

public class Hat extends ClothingItem {
    public Hat(ClothingSize size, double price, int quantity) {
        super(ClothingItem.HAT, size, price, quantity);
    }
}
