package SNET.web.controllers;

import SNET.domain.dto.message.ChatMessageDTO;

public interface MessageController {

    public ChatMessageDTO sendToClient(ChatMessageDTO messageDTO);

}
