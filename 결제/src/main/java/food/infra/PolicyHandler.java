package food.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import food.config.kafka.KafkaProcessor;
import food.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    결제Repository 결제Repository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='CookStarted'"
    )
    public void wheneverCookStarted_주문상태변경한다(
        @Payload CookStarted cookStarted
    ) {
        CookStarted event = cookStarted;
        System.out.println(
            "\n\n##### listener 주문상태변경한다 : " + cookStarted + "\n\n"
        );

        // Sample Logic //
        결제.주문상태변경한다(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DeliveryFinished'"
    )
    public void wheneverDeliveryFinished_주문상태변경한다(
        @Payload DeliveryFinished deliveryFinished
    ) {
        DeliveryFinished event = deliveryFinished;
        System.out.println(
            "\n\n##### listener 주문상태변경한다 : " + deliveryFinished + "\n\n"
        );

        // Sample Logic //
        결제.주문상태변경한다(event);
    }
}
