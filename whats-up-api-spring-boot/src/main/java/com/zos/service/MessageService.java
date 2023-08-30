package com.zos.service;

import java.util.List;

import com.zos.exception.ChatException;
import com.zos.exception.MessageException;
import com.zos.exception.UserException;
import com.zos.modal.Message;
import com.zos.request.SendMessageRequest;

public interface MessageService  {
	
	public Message sendMessage(SendMessageRequest req) throws UserException, ChatException;
	
	public List<Message> getChatsMessages(Integer chatId) throws ChatException;
	
	public Message findMessageById(Integer messageId) throws MessageException;
	
	public String deleteMessage(Integer messageId) throws MessageException;

}
