package linking.jmuster.decorator;

abstract class PizzaComponent {

    private String description = "Unknown Pizza";

    public String getDescription(){
        return description;
    }

    public void setDescription(String desc){
        description = desc;
    }

    public abstract double cost();

}
