package linking.jmuster.decorator;

public class FlatbreadCrust extends PizzaComponent{

    public FlatbreadCrust (){
        this.setDescription("Flatbread Style Pizza");
    }

    @Override
    public double cost() {
        return Prices.FLATBREAD_CRUST;
    }
}
