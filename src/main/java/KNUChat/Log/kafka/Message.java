package KNUChat.Log.kafka;

import KNUChat.Log.domain.LogType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    private Date time;
    private String service;
    private LogType type;
    private String logMessage;
    private Long roomId;
    private Long userId;
}