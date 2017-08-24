package linking.jmuster.observer;

public class MagazinePublisher extends Publisher{

    @Override
    public void notifySuscribers() {
        System.out.println("Magazine Published, notifying subscribers");
        for( iSubscriber s: suscriberList){
            s.update("MagazinePublisher", valueToPublish);
        }
    }
}
