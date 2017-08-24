package linking.jmuster.observer;

public class PostalSubscriber implements iSubscriber {
    @Override
    public void update(String from, String value) {
        System.out.println("PostalSubscriber  received from"
                + from
                +" a new value = "+value);
    }
}
