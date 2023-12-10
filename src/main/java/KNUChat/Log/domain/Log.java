package KNUChat.Log.domain;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Getter
@Document(collection = "logs")
public class Log {

    @Id
    @Field()
    private String id;
    @Field("time")
    private Date time;
    @Field("service")
    private String service;
    @Field("type")
    private LogType type;
    @Field("message")
    private String logMessage;
    @Field("roomId")
    private Long roomId;
    @Field("userId")
    private Long userId;

    @Builder
    public Log(Date time, String service, LogType type, String logMessage, Long roomId, Long userId) {
        this.time = time;
        this.service = service;
        this.type = type;
        this.logMessage = logMessage;
        this.roomId = roomId;
        this.userId = userId;
    }
}