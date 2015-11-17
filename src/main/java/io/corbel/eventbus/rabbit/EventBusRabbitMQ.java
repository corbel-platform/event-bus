package io.corbel.eventbus.rabbit;

/**
 * @author Alexander De Leon
 *
 */
public interface EventBusRabbitMQ {

    String EVENTBUS_EXCHANGE = "io.corbel.eventbus.exchange";

    String EVENTNBUS_LISTENER_QUEUE_TEMPLATE = "io.corbel.eventbus.{0}.queue";
}
