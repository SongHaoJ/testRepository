package producer.sender;

import org.apache.activemq.ScheduledMessage;

import javax.jms.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Sender {

    private AtomicInteger count = new AtomicInteger();

    private Connection connection;

    private Session session;

    private MessageProducer producer;

    public void init(ConnectionFactory connectionFactory,Queue que) {
        try {
            //从工厂中创建一个链接
            connection = connectionFactory.createConnection();
            //启动链接,不启动不影响消息的发送，但影响消息的接收
            connection.start();
            //创建一个事物session
            session = connection.createSession(true, Session.SESSION_TRANSACTED);
            //获取消息发送的生产者
            producer = session.createProducer(que);
            System.out.println("name:"+que.getQueueName());
        } catch (JMSException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void sendMsg(Long delayTime) {
        try {
            int num = count.getAndIncrement();
            TextMessage msg = session.createTextMessage(Thread.currentThread().getName()+
                    "productor:生产者发送消息！,count:"+num);
            msg.setLongProperty(ScheduledMessage.AMQ_SCHEDULED_DELAY, delayTime);
            producer.send(msg);
            System.out.println("时间："+System.currentTimeMillis()/1000);
            System.out.println("delayTime："+delayTime);
            session.commit();
        } catch (JMSException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
