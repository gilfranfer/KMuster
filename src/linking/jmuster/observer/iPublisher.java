package linking.jmuster.observer;

public interface iPublisher {
    void subscribe( iSubscriber s );
    void unsubscribe( iSubscriber s );
    void notifySuscribers();
}
