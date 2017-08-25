package linking.jmuster.decorator;

public class NewYorkCrust extends PizzaComponent{

    public NewYorkCrust() {
        this.setDescription("NewYork Style Pizza");
    }

    @Override
    public double cost() {
        return Prices.NY_CRUST;
    }

}
