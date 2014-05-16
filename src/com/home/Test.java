package com.home;


import javax.jms.JMSException;

/**
 * Created by Angela on 5/11/2014.
 */

public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) throws JMSException, Exception {
        // TODO Auto-generated method stub
        ConsumerTool consumer = new ConsumerTool();
        ProducerTool producer = new ProducerTool();
        // start listening
        consumer.consumeMessage();

        // send msg after 500msec
        Thread.sleep(500);
        producer.produceMessage("Hello, world!");
        producer.close();

        // stop consume after 500msec
        Thread.sleep(500);
        consumer.close();
    }
}
