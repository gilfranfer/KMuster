package linking.jmuster.observer;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class iPublisherTest {

    static iSubscriber es1, ws1, ps1;

    @BeforeAll
    static void setUp() {
        es1 = new EmailSubscriber();
        ws1 = new WebSubscriber();
        ps1 = new PostalSubscriber();
    }

    @Test
    void subscribe() {

        Publisher mag = new MagazinePublisher();

        assertNotNull( mag.getSuscriberList() );
        assertEquals(0,mag.getSuscriberList().size());

        mag.subscribe(es1);
        mag.subscribe(ws1);
        mag.subscribe(ps1);

        assertEquals(3,mag.getSuscriberList().size());

    }

    @Test
    void unsubscribe() {
        Publisher j = new JournalPublisher();
        j.subscribe(es1);
        j.subscribe(ws1);

        j.unsubscribe(ps1);
        assertEquals(2,j.getSuscriberList().size());
        j.unsubscribe(es1);
        assertEquals(1,j.getSuscriberList().size());
    }

    @Test
    void notifySuscribers() {
        Publisher mag = new MagazinePublisher();
        Publisher jou = new JournalPublisher();

        mag.subscribe(es1);
        mag.subscribe(ws1);
        mag.subscribe(ps1);

        jou.subscribe(es1);
        jou.subscribe(ps1);

        mag.setValueToPublish("This Week Magazine Ready");
        jou.setValueToPublish("Today's News");

    }

}