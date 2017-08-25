package linking.jmuster.observer;

import java.util.ArrayList;
import java.util.List;

abstract class Publisher implements iPublisher {

    protected List<iSubscriber> suscriberList = new ArrayList<>();
    protected String valueToPublish;

    @Override
    public void subscribe(iSubscriber s) {
        suscriberList.add(s);
    }

    @Override
    public void unsubscribe(iSubscriber s) {
        suscriberList.remove(s);
    }

    public List<iSubscriber> getSuscriberList() {
        return suscriberList;
    }

    public void setValueToPublish(String valueToPublish) {
        this.valueToPublish = valueToPublish;
        this.notifySuscribers();
    }

}
