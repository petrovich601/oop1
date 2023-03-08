import java.util.ArrayList;
import java.util.List;

public class VendingMachine implements Vending{
    private List<Drink> drinks = new ArrayList<>();

    public void intProduct(List<Drink> drinks) {
        this.drinks = drinks;
    }
    public HotDrink getProduct(String name){
        for (Drink p : drinks) {
            if (p.getDrink().equals(name)){
                return (HotDrink) p;
            }
        }
        return new HotDrink("product is  undefined", 0, 0);

    }

    @Override
    public void intProduct() {

    }

}
