package org.openingo.mq;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.openingo.spring.boot.extension.mq.rocket.AbstractConsumer;
import org.springframework.stereotype.Component;

/**
 * Consumer
 *
 * @author Qicz
 * @since 2021/8/2 17:26
 */
@Slf4j
@Component
@RocketMQMessageListener(topic = Producer.TOPIC, consumerGroup = Producer.TOPIC + "-consumer-group")
public class Consumer extends AbstractConsumer<Payload> {

	@Override
	public void onMessage(Payload payload) {
		log.info("recv data {}", payload);
	}
}
