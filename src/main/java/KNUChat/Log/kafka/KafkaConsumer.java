package KNUChat.Log.kafka;

import KNUChat.Log.application.LogService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaConsumer {
    @Autowired
    private final LogService logService;

    @KafkaListener(topics = "log", errorHandler = "kafkaErrorHandler")
    public void getKafkaMessage(Message message){
        logService.saveLog(message);
    }
}
