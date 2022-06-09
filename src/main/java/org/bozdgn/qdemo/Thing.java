package org.bozdgn.qdemo;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class Thing {
    @RabbitListener(queues = "${boz.queue}")
    public void receive(@Payload String payload) {
        System.out.println("Dendi ki "+ payload);
    }
}
