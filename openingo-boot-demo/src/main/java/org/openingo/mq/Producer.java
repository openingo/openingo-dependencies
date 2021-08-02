package org.openingo.mq;

import org.openingo.spring.boot.extension.mq.rocket.AbstractProducer;
import org.springframework.stereotype.Component;

/**
 * Producer
 *
 * @author Qicz
 * @since 2021/8/2 17:18
 */
@Component
public class Producer extends AbstractProducer<Payload> {

	public final static String TOPIC = "qicz-topic";
}
