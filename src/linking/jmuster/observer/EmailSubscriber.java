package linking.jmuster.observer;

public class EmailSubscriber implements iSubscriber{
    @Override
    public void update(String from, String value) {
        System.out.println("EmailSubscriber received from"
                + from
                +" a new value = "+value);
    }
}
