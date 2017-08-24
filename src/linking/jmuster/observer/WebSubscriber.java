package linking.jmuster.observer;

public class WebSubscriber implements iSubscriber{
    @Override
    public void update(String from, String value) {
        System.out.println("WebSubscriber  received from"
                + from
                +" a new value = "+value);
    }
}
