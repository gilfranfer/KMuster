package linking.jmuster.observer;

public class JournalPublisher extends Publisher{

    @Override
    public void notifySuscribers() {
        System.out.println("Journal Published, notifying subscribers");
        for( iSubscriber s: suscriberList){
            s.update("JournalPublisher",this.valueToPublish);
        }
    }

}
