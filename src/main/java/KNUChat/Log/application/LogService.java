package KNUChat.Log.application;

import KNUChat.Log.domain.Log;
import KNUChat.Log.kafka.Message;
import KNUChat.Log.repository.LogRepository;
import org.springframework.stereotype.Service;

@Service
public class LogService {
    private final LogRepository logRepository;

    public LogService(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    public String saveLog(Message message) {
        Log log = Log.builder()
                .time(message.getTime())
                .service(message.getService())
                .type(message.getType())
                .logMessage(message.getLogMessage())
                .userId(message.getUserId())
                .roomId(message.getRoomId()).build();

        logRepository.save(log);

        return log.getId();
    }
}

