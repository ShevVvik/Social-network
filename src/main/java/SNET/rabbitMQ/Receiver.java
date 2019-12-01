package SNET.rabbitMQ;

import SNET.dao.ChatMessageRepository;
import SNET.domain.dto.message.ChatMessageDTO;
import SNET.domain.entity.message.ChatMessage;
import SNET.utils.ConverterMessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @Autowired
    private ChatMessageRepository chatMessageRepository;

    public void getMessage(ChatMessageDTO message) {
        try {
            Thread.sleep(10_000);
            System.out.println("Complete");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ChatMessage chatMessage = ConverterMessageDTO.mapChatDTOtoMessage(message);
        chatMessageRepository.save(chatMessage);
    }



}
