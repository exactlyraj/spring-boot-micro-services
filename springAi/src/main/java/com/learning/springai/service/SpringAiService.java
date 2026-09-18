package com.learning.springai.service;


import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.model.ChatModel;

import org.springframework.stereotype.Service;

@Service
public class SpringAiService {
    private ChatModel chatModel;

    SpringAiService(ChatModel chatModel){
        this.chatModel = chatModel;
    }

    public String call(String prompt){
        return  chatModel.call(new UserMessage(prompt));
    }


}
