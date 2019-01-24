package producer.controller;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import producer.sender.Sender;

import javax.jms.Queue;
import javax.jms.Topic;

@RestController
@RequestMapping("/publish")
public class PublishController {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Autowired
    private JmsMessagingTemplate jms;

    @Autowired
    private ActiveMQConnectionFactory connectionFactory;

    @Autowired
    private Queue queue;

    @Autowired
    private Queue que;

    @Autowired
    private Topic topic;

@GetMapping("/kafka")
    public void sendLog(String userid){
        kafkaTemplate.send("user-log", "sh","useruseruseruseruser");
    }



    @GetMapping("/queue")
    public String queue(){
        Sender sender = new Sender();
        sender.init(connectionFactory,queue);
        try{
            sender.sendMsg(10*1000L);
        }catch (Exception e){
            return e.getMessage();
        }
        return "queue 发送成功";
    }

    @GetMapping("/que")
    public String que(){
        Sender sender = new Sender();
        sender.init(connectionFactory,que);
        try{
            int i = 0;
            while(i<10){
                Long delayTime = (10+2*i)*1000L;
            sender.sendMsg(delayTime);
            i++;
            }
        }catch (Exception e){
            return e.getMessage();
        }
        return "que 发送成功";
    }

    @JmsListener(destination = "out.queue")
    public void consumerMsg(String msg){
        System.out.println(msg);
    }

    @GetMapping("/topic")
    public String topic(){

        for (int i = 0; i < 10 ; i++){
            jms.convertAndSend(topic, "topic"+i);
        }

        return "topic 发送成功";
    }
}